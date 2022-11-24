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

import java.util.List;

/**
 * Interface for Okapi tracking service.
 *
 * @author Erik
 * @author Julien
 */
public interface IOkapiService {

    /**
     * Search for a tracking.
     *
     * @param trackingNumber tracking number
     * @return the tracking
     * @throws OTException exception
     */
    OkapiTracking getTracking(final String trackingNumber) throws OTException;

    /**
     * Search for multiple trackings (up to 10)
     *
     * @param trackingNumbers tracking numbers
     * @return the trackings
     * @throws OTException exception
     */
    List<OkapiTracking> getTracking(final List<String> trackingNumbers) throws OTException;

    /**
     * Search for a tracking.
     *
     * @param trackingNumber tracking number
     * @param lang language
     * @return the tracking
     * @throws OTException exception
     */
    OkapiTracking getTracking(final String trackingNumber, final OTLang lang) throws OTException;

    /**
     * Search for multiple trackings (up to 10)
     *
     * @param trackingNumbers tracking numbers
     * @param lang language
     * @return the trackings
     * @throws OTException exception
     */
    List<OkapiTracking> getTracking(final List<String> trackingNumbers, final OTLang lang) throws OTException;
}
