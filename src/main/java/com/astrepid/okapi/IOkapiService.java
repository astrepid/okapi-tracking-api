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
 * Interface d'accès à l'API de La Poste Suivi v2.
 *
 * @author Erik
 */
public interface IOkapiService {

    /**
     * Recherche le suivi d'un envoi.
     *
     * @param numeroSuivi le numéro de suivi
     * @return le suivi
     * @throws OTException en cas d'erreur
     */
    OkapiTracking getTracking(final String numeroSuivi) throws OTException;

    /**
     * Recherche le suivi d'un envoi.
     *
     * @param numerosSuivi le numéro de suivi
     * @return le suivi
     * @throws OTException en cas d'erreur
     */
    List<OkapiTracking> getTracking(final List<String> numerosSuivi) throws OTException;

    /**
     * Recherche le suivi d'un envoi.
     *
     * @param numeroSuivi le numéro de suivi
     * @param langue      langue de retour souhaitée
     * @return le suivi
     * @throws OTException en cas d'erreur
     */
    OkapiTracking getTracking(final String numeroSuivi, final OTLang langue) throws OTException;

    /**
     * Recherche le suivi de plusieurs envoi.
     *
     * @param numerosSuivi le numéro de suivi
     * @param langue       langue de retour souhaitée
     * @return le suivi
     * @throws OTException en cas d'erreur
     */
    List<OkapiTracking> getTracking(final List<String> numerosSuivi, final OTLang langue) throws OTException;
}
