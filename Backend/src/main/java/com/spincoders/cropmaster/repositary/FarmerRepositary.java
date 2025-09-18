package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Farmer;

@Repository
public interface FarmerRepositary extends JpaRepository<Farmer,Integer> {

    Farmer findByNic(String nic);
}
