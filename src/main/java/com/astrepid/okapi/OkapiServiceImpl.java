/*
 * Copyright 2020 Erik Amzallag
 * Copyright 2022 Julien Satti
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.astrepid.okapi;

import com.astrepid.okapi.tracking.OTException;
import com.astrepid.okapi.tracking.OTLang;
import com.astrepid.okapi.tracking.OkapiTracking;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Implémentation du service.
 */
public class OkapiServiceImpl implements IOkapiService {

    /**
     * URL of the API.
     */
    private static final String URL = "https://api.laposte.fr/suivi/v2/idships/";

    /**
     * Okapi key.
     */
    private final String KEY;

    /**
     * Constructor.
     *
     * @param okapiKey private Okapi key
     */
    public OkapiServiceImpl(String okapiKey) {
        KEY = okapiKey;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OkapiTracking getTracking(String numeroSuivi) throws OTException {
        return getTracking(numeroSuivi, null);
    }

    @Override
    public List<OkapiTracking> getTracking(List<String> numerosSuivi) throws OTException {
        return getTracking(numerosSuivi, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OkapiTracking getTracking(String numeroSuivi, OTLang lang) throws OTException {
        String url = URL + numeroSuivi;
        if (lang != null) {
            url += "?lang=" + lang.name();
        }
        try {
            String output = callRestService(url);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(output, OkapiTracking.class);
        } catch (Exception e) {
            throw new OTException(e.getMessage());
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public List<OkapiTracking> getTracking(List<String> numerosSuivi, OTLang lang) throws OTException {
        if (numerosSuivi == null || numerosSuivi.isEmpty()) {
            throw new OTException("The list of tracking numbers is empty");
        }

        // Remove duplicates
        numerosSuivi = numerosSuivi.stream().distinct().collect(Collectors.toList());

        if (numerosSuivi.size() == 1) {
            return Collections.singletonList(getTracking(numerosSuivi.get(0), lang));
        }

        if (numerosSuivi.size() > 10) {
            throw new OTException("The list of tracking numbers must not contain more than 10 elements");
        }

        String url = URL + String.join(",", numerosSuivi);
        if (lang != null) {
            url += "?lang=" + lang.name();
        }
        try {
            String output = callRestService(url);
            ObjectMapper mapper = new ObjectMapper();
            return Arrays.asList(mapper.readValue(output, OkapiTracking[].class));
        } catch (Exception e) {
            throw new OTException(e.getMessage());
        }
    }

    /**
     * Call the service.
     *
     * @param url full url
     * @return JSON representation
     * @throws OTException en cas d'exception
     */
    private String callRestService(String url) throws OTException {
        try {
            OkHttpClient client = new OkHttpClient()
                    .newBuilder()
                    .build();
            Request request = new Request.Builder()
                    .url(url)
                    .method("GET", null)
                    .addHeader("X-Okapi-Key", KEY)
                    .addHeader("Accept", "application/json")
                    .build();
            Response response = client.newCall(request).execute();
            return Objects.requireNonNull(response.body()).string();
        } catch (Exception e) {
            throw new OTException(e.getMessage());
        }
    }

}
