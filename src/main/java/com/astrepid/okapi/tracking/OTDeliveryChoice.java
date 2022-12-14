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
 * Available services
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OTDeliveryChoice {

    /**
     * Delivery choice (modification request).
     */
    private OTCodeDeliveryChoice deliveryChoice;

    /**
     * @return the deliveryChoice
     */
    public OTCodeDeliveryChoice getDeliveryChoice() {
        return deliveryChoice;
    }

    /**
     * @param deliveryChoice the deliveryChoice to set
     */
    public void setDeliveryChoice(OTCodeDeliveryChoice deliveryChoice) {
        this.deliveryChoice = deliveryChoice;
    }

}
