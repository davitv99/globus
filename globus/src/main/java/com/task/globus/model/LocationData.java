/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.globus.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author davitv
 */

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "latitude",
        "longitude",
        "type",
        "name",
        "number",
        "postal_code",
        "street",
        "confidence",
        "region",
        "region_code",
        "county",
        "locality",
        "administrative_area",
        "neighbourhood",
        "country",
        "country_code",
        "continent",
        "label"
    })
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class LocationData {

        @JsonProperty("latitude")
        public Double latitude;
        @JsonProperty("longitude")
        public Double longitude;
        @JsonProperty("type")
        public String type;
        @JsonProperty("name")
        public String name;
        @JsonProperty("number")
        public Object number;
        @JsonProperty("postal_code")
        public Object postalCode;
        @JsonProperty("street")
        public Object street;
        @JsonProperty("confidence")
        public Double confidence;
        @JsonProperty("region")
        public String region;
        @JsonProperty("region_code")
        public String regionCode;
        @JsonProperty("county")
        public Object county;
        @JsonProperty("locality")
        public Object locality;
        @JsonProperty("administrative_area")
        public Object administrativeArea;
        @JsonProperty("neighbourhood")
        public Object neighbourhood;
        @JsonProperty("country")
        public String country;
        @JsonProperty("country_code")
        public String countryCode;
        @JsonProperty("continent")
        public String continent;
        @JsonProperty("label")
        public String label;

    }
