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
 * Other information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OTContextData {

    /**
     * Removal point.
     */
    private OTRemovalPoint removalPoint;

    /**
     * Available services.
     */
    private OTDeliveryChoice deliveryChoice;

    /**
     * Origin country code.
     */
    private String originCountry;

    /**
     * Destination country code.
     */
    private String arrivalCountry;

    /**
     * Information about the foreign logistical partner.
     */
    private OTPartner partner;

    /**
     * @return the removalPoint
     */
    public OTRemovalPoint getRemovalPoint() {
        return removalPoint;
    }

    /**
     * @param removalPoint the removalPoint to set
     */
    public void setRemovalPoint(OTRemovalPoint removalPoint) {
        this.removalPoint = removalPoint;
    }

    /**
     * @return the deliveryChoice
     */
    public OTDeliveryChoice getDeliveryChoice() {
        return deliveryChoice;
    }

    /**
     * @param deliveryChoice the deliveryChoice to set
     */
    public void setDeliveryChoice(OTDeliveryChoice deliveryChoice) {
        this.deliveryChoice = deliveryChoice;
    }

    /**
     * @return the originCountry
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * @param originCountry the originCountry to set
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * @return the arrivalCountry
     */
    public String getArrivalCountry() {
        return arrivalCountry;
    }

    /**
     * @param arrivalCountry the arrivalCountry to set
     */
    public void setArrivalCountry(String arrivalCountry) {
        this.arrivalCountry = arrivalCountry;
    }

    /**
     * @return the partner
     */
    public OTPartner getPartner() {
        return partner;
    }

    /**
     * @param partner the partner to set
     */
    public void setPartner(OTPartner partner) {
        this.partner = partner;
    }

}
