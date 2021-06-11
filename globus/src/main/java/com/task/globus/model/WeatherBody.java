/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.globus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author davitv
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WeatherBody implements Serializable {
    

@JsonProperty("coord")
private Coord coord;
@JsonProperty("weather")
private List<Weather> weather = null;
@JsonProperty("base")
private String base;
@JsonProperty("main")
private Main main;
@JsonProperty("visibility")
private Integer visibility;
@JsonProperty("wind")
private Wind wind;
@JsonProperty("clouds")
private Clouds clouds;
@JsonProperty("dt")
private Integer dt;
@JsonProperty("sys")
private Sys sys;
@JsonProperty("timezone")
private Integer timezone;
@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;
@JsonProperty("cod")
private Integer cod;

}
