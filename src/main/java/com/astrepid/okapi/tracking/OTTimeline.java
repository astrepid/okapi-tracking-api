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

import java.util.Calendar;

/**
 * Objet définissant la timeline. <br>
 * Les étapes 1 à 5 sont présentes.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OTTimeline {

    /**
     * Identifiant de l'étape.
     */
    private Integer id;
    /**
     * Libellé court.
     */
    private String shortLabel;
    /**
     * Libellé Long.
     */
    private String longLabel;
    /**
     * Date de l’évènement.
     */
    private Calendar date;
    /**
     * Code iso du pays de l’étape.
     */
    private String country;
    /**
     * Etat actif ou non de l’étape.
     */
    private boolean status;
    /**
     * Type d’action.
     */
    private OTActionType type;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the shortLabel
     */
    public String getShortLabel() {
        return shortLabel;
    }

    /**
     * @param shortLabel the shortLabel to set
     */
    public void setShortLabel(String shortLabel) {
        this.shortLabel = shortLabel;
    }

    /**
     * @return the longLabel
     */
    public String getLongLabel() {
        return longLabel;
    }

    /**
     * @param longLabel the longLabel to set
     */
    public void setLongLabel(String longLabel) {
        this.longLabel = longLabel;
    }

    /**
     * @return the date
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the type
     */
    public OTActionType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(OTActionType type) {
        this.type = type;
    }

}
