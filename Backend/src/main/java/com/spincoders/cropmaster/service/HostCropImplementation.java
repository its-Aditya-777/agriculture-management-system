package com.spincoders.cropmaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spincoders.cropmaster.model.HostCrop;
import com.spincoders.cropmaster.repositary.HostCropRepositary;

import java.util.List;

@Service
public class HostCropImplementation implements HostCropService {

    @Autowired
    private HostCropRepositary hostCropRepositary;

    @Override
    public HostCrop saveHostCrop(HostCrop hostCrop) {
        return hostCropRepositary.save(hostCrop);
    }

    @Override
    public List<HostCrop> getAllHostCrop() {
        return hostCropRepositary.findAll();
    }

    @Override
    public List<HostCrop> getDiseaseByFarmland(int farmlandID) {
        return hostCropRepositary.findDiseaseByFarmland(farmlandID);
    }
}
