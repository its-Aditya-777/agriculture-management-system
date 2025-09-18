package com.spincoders.cropmaster.service;

import java.util.List;

import com.spincoders.cropmaster.model.Harvest;

public interface HarvestService {

    public Harvest saveHarvest(Harvest harvest);

    public List<Harvest> getAllHarvest();
}
