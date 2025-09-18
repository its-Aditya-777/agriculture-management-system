package com.spincoders.cropmaster.service;

import java.util.Optional;

import com.spincoders.cropmaster.model.Soil;

public interface SoilService {

    public Soil saveSoil(Soil soil);

    public Soil getSoilinfoById(int farmlandID);

}
