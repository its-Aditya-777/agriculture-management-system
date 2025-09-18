package com.spincoders.cropmaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spincoders.cropmaster.model.Weather;
import com.spincoders.cropmaster.repositary.WeatherRepositary;

@Service
public class WeatherImplementation implements WeatherService{

    @Autowired
    private WeatherRepositary weatherRepositary;


    @Override
    public Weather saveWeather(Weather weather) {
        return weatherRepositary.save(weather);
    }

    @Override
    public Weather getWeatherinfoById(int farmlandID) {
        return weatherRepositary.findByFarmlandID(farmlandID);
    }
}
