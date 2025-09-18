package com.spincoders.cropmaster.service;

import java.util.List;
import java.util.Optional;

import com.spincoders.cropmaster.model.Crop;

public interface CropService {

    public Crop saveCrop(Crop crop);

    public List<Crop> getAllCrop();

    public Optional<Crop> getCropByID(int cropID);
}
