package com.spincoders.cropmaster.service;

import java.util.List;

import com.spincoders.cropmaster.model.HostCrop;

public interface HostCropService {
    public HostCrop saveHostCrop(HostCrop hostCrop);

    public List<HostCrop> getAllHostCrop();

    public List<HostCrop> getDiseaseByFarmland(int farmlandID);

}
