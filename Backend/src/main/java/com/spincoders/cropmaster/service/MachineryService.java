package com.spincoders.cropmaster.service;

import java.util.List;

import com.spincoders.cropmaster.model.Machinery;

public interface MachineryService {

    public Machinery saveMachinery(Machinery machinery);

    public List<Machinery> getAllMachinery();
}
