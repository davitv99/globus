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

/**
 *
 * @author davitv
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"speed",
"deg",
"gust"
})
public class Wind implements Serializable{

@JsonProperty("speed")
public Double speed;
@JsonProperty("deg")
public Integer deg;

}
