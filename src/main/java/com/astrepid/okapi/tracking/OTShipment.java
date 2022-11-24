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

import java.util.Calendar;
import java.util.List;

/**
 * Détail de l’objet.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OTShipment {

    /**
     * Métier en charge de l'objet.
     */
    private Integer holder;
    /**
     * Identifiant métier de l'objet.
     */
    private String idShip;
    /**
     * URL vers le suivi web détaillé.
     */
    private String urlDetail;
    /**
     * Dénomination du produit.
     */
    private String product;
    /**
     * Objet est-il au statut final ?
     */
    private boolean isFinal;
    /**
     * Date de prise en charge.
     */
    private Calendar entryDate;
    /**
     * Date de livraison.
     */
    private Calendar deliveryDate;

    /**
     * Liste des évènements - Fournie selon un ordre anti-chronologique.
     */
    private List<OTEvent> event;

    /**
     * Objet définissant la timeline.
     */
    private List<OTTimeline> timeline;

    /**
     * Informations supplémentaires.
     */
    private OTContextData contextData;

    /**
     * @return the holder
     */
    public Integer getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(Integer holder) {
        this.holder = holder;
    }

    /**
     * @return the idShip
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

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the isFinal
     */
    public boolean isFinal() {
        return isFinal;
    }

    /**
     * @param isFinal the isFinal to set
     */
    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    /**
     * @return the entryDate
     */
    public Calendar getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate the entryDate to set
     */
    public void setEntryDate(Calendar entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * @return the event
     */
    public List<OTEvent> getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(List<OTEvent> event) {
        this.event = event;
    }

    /**
     * @return the timeline
     */
    public List<OTTimeline> getTimeline() {
        return timeline;
    }

    /**
     * @param timeline the timeline to set
     */
    public void setTimeline(List<OTTimeline> timeline) {
        this.timeline = timeline;
    }

    /**
     * @return the contextData
     */
    public OTContextData getContextData() {
        return contextData;
    }

    /**
     * @param contextData the contextData to set
     */
    public void setContextData(OTContextData contextData) {
        this.contextData = contextData;
    }

    /**
     * @return the urlDetail
     */
    public String getUrlDetail() {
        return urlDetail;
    }

    /**
     * @param urlDetail the urlDetail to set
     */
    public void setUrlDetail(String urlDetail) {
        this.urlDetail = urlDetail;
    }

    /**
     * @return the deliveryDate
     */
    public Calendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * @param deliveryDate the deliveryDate to set
     */
    public void setDeliveryDate(Calendar deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}
