/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.globus.controller;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.task.globus.model.LocationData;
import com.task.globus.model.LocationFinal;
import com.task.globus.model.WeatherBody;
import com.task.globus.service.AppService;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author davitv
 */
@RestController
@RequestMapping("/api/v2/weatherapp")
@Slf4j
public class AppController {

    private RestTemplate restTemplate = new RestTemplate();
    @Autowired
    public AppService utility;
    String locationAPI = "http://api.positionstack.com/v1/forward?access_key=";
    String weatherAPI = "http://api.openweathermap.org/data/2.5/weather"; 
    @GetMapping(path = "/getlocation", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @Transactional
    public WeatherBody getweather(@RequestParam(required=true) String country,String city, String loctoken, String weathertoken) {
        String locdata = restTemplate.getForObject(locationAPI+loctoken+"&query=1600" + country + ", " + city, String.class);
        try {
            LocationFinal locfin = utility.locJSONConverter(locdata);
            List<LocationData> locls = locfin.getLdata();
            System.out.println(locls);
            LocationData latlon = locls.get(0);
            Double lat = latlon.getLatitude();
            Double lon = latlon.getLongitude();
            String wetdata = restTemplate.getForObject(weatherAPI + "?lat=" + lat + "&" + "lon=" + lon + "&appid="+weathertoken, String.class);
            return utility.JSONConverter(wetdata);
        } catch (JsonMappingException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.SEVERE, null, ex);
            return new WeatherBody();
        } catch (IOException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.SEVERE, null, ex);
            return new WeatherBody();
        }

    }
}
