package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Soil;
import com.spincoders.cropmaster.model.Weather;

@Repository
public interface WeatherRepositary extends JpaRepository<Weather, Integer> {

    Weather findByFarmlandID(int farmlandID);

}
