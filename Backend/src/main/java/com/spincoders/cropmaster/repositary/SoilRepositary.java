package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Soil;

@Repository
public interface SoilRepositary extends JpaRepository<Soil, Integer> {
    Soil findByFarmlandID(int farmlandID);
}
