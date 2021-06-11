/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.globus.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"type",
"id",
"message",
"country",
"sunrise",
"sunset"
})
public class Sys implements Serializable {

@JsonProperty("type")
public Integer type;
@JsonProperty("id")
public Integer id;
@JsonProperty("message")
public Double message;
@JsonProperty("country")
public String country;
@JsonProperty("sunrise")
public Integer sunrise;
@JsonProperty("sunset")
public Integer sunset;

}
