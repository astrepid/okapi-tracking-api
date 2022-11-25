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
package com.astrepid.okapi.tracking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Tracking.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OkapiTracking {

    /**
     * Answer language.
     */
    private OTLang lang;

    /**
     * Service call context.
     */
    private String scope;

    /**
     * Return code
     */
    private Integer returnCode;

    /**
     * Shipment details - Null if returnCode != 2XX.
     */
    private OTShipment shipment;

    /**
     * Error code - Null if returnCode = 200.
     */
    private String returnMessage;

    /**
     * Requested tracking number - Null if returnCode = 200.
     */
    private String idShip;

    /**
     * @return the lang
     */
    public OTLang getLang() {
        return lang;
    }

    /**
     * @param lang the lang to set
     */
    public void setLang(OTLang lang) {
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
     * @return the idShip.
     */
    public String getIdShip() {
        return idShip == null ? shipment.getIdShip() : idShip;
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
