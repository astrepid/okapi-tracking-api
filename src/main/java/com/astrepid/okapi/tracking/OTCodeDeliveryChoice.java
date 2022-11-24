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

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Modification de livraison.
 */
public enum OTCodeDeliveryChoice {

    POSSIBLE(1, "Possible"), CHOISI(2, "Choisi");

    private final int code;

    private final String label;

    OTCodeDeliveryChoice(int code, String label) {
        this.code = code;
        this.label = label;
    }

    /**
     * @param code code delivery
     * @return DeliveryChoice
     */
    @JsonCreator
    public static OTCodeDeliveryChoice fromCode(int code) {

        for (OTCodeDeliveryChoice codeDelivery : OTCodeDeliveryChoice.values()) {
            if (codeDelivery.getCode() == code) {
                return codeDelivery;
            }
        }
        return null;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

}
