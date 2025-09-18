package com.spincoders.cropmaster.service;

import java.util.List;

import com.spincoders.cropmaster.model.Irrigation;

public interface IrrigationService {

    public Irrigation saveIrrigation(Irrigation irrigation);

    public List<Irrigation> getAllIrrigation();
}
