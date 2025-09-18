package com.spincoders.cropmaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spincoders.cropmaster.model.Irrigation;
import com.spincoders.cropmaster.repositary.IrrigationRepositary;

import java.util.List;

@Service
public class IrrigationImplementation implements IrrigationService{

    @Autowired
    private IrrigationRepositary irrigationRepositary;


    @Override
    public Irrigation saveIrrigation(Irrigation irrigation) {
        return irrigationRepositary.save(irrigation);
    }

    @Override
    public List<Irrigation> getAllIrrigation() {
        return irrigationRepositary.findAll();
    }
}
