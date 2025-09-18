package com.spincoders.cropmaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spincoders.cropmaster.model.Machinery;
import com.spincoders.cropmaster.repositary.MachineryRepositary;

import java.util.List;

@Service
public class MachineryImplementation implements MachineryService{

    @Autowired
    private MachineryRepositary machineryRepositary;

    @Override
    public Machinery saveMachinery(Machinery machinery) {
        return machineryRepositary.save(machinery);
    }

    @Override
    public List<Machinery> getAllMachinery() {
        return machineryRepositary.findAll();
    }
}
