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
"id",
"main",
"description",
"icon"
})
public class Weather implements Serializable{

@JsonProperty("id")
public Integer id;
@JsonProperty("main")
public String main;
@JsonProperty("description")
public String description;
@JsonProperty("icon")
public String icon;

}
