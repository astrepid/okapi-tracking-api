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
package com.astrepid.okapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Suivi.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OkapiTracking {

    /**
     * Langue de réponse.
     */
    private OTLanguage lang;

    /**
     * Contexte d’appel du service.
     */
    private String scope;

    /**
     * Code retour.
     */
    private Integer returnCode;

    /**
     * Détail de l’objet - Null si returnCode != 2XX.
     */
    private OTShipment shipment;

    /**
     * Message d’erreur - Null si returnCode = 200.
     */
    private String returnMessage;

    /**
     * Objet demandé - Null si returnCode = 200.
     */
    private String idShip;

    /**
     * @return the lang
     */
    public OTLanguage getLang() {
        return lang;
    }

    /**
     * @param lang the lang to set
     */
    public void setLang(OTLanguage lang) {
        this.lang = lang;
    }

    /**
     * @return the scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope the scope to set
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * @return the returnCode
     */
    public Integer getReturnCode() {
        return returnCode;
    }

    /**
     * @param returnCode the returnCode to set
     */
    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * @return the shipment. Null si returnCode != 2XX
     */
    public OTShipment getShipment() {
        return shipment;
    }

    /**
     * @param shipment the shipment to set
     */
    public void setShipment(OTShipment shipment) {
        this.shipment = shipment;
    }

    /**
     * @return the returnMessage. Null si returnCode = 200.
     */
    public String getReturnMessage() {
        return returnMessage;
    }

    /**
     * @param returnMessage the returnMessage to set
     */
    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    /**
     * @return the idShip. Null si returnCode = 200.
     */
    public String getIdShip() {
        return idShip;
    }

    /**
     * @param idShip the idShip to set
     */
    public void setIdShip(String idShip) {
        this.idShip = idShip;
    }

    public boolean isSuccess() {
        return returnCode == 200;
    }

}
