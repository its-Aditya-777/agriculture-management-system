package com.spincoders.cropmaster.service;

import org.springframework.http.ResponseEntity;

import com.spincoders.cropmaster.model.Farmer;

import java.util.List;


public interface FarmerService {

    public Farmer saveFarmer(Farmer farmer);

    public List<Farmer> getAllFarmers();

    public ResponseEntity<String> authenticateFarmer(String nic, String password);

    public Farmer findByNic(String nic);
}
