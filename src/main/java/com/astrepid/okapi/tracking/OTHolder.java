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
 * Holder of the package/parcel/letter.
 */
public enum OTHolder {

    COURRIER_NATIONAL(1, "courrier nat"),

    COURRIER_INTERNATIONAL(2, "courrier inter"),

    CHRONOPOST(3, "chronopost"),

    COLISSIMO(4, "colissimo");

    private final int code;

    private final String label;

    OTHolder(int code, String label) {
        this.code = code;
        this.label = label;
    }

    /**
     * @param code code holder
     * @return Holder
     */
    @JsonCreator
    public static OTHolder fromCode(int code) {

        for (OTHolder codeHolder : OTHolder.values()) {
            if (codeHolder.getCode() == code) {
                return codeHolder;
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
