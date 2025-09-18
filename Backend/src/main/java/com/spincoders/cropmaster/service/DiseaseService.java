package com.spincoders.cropmaster.service;

import java.util.List;

import com.spincoders.cropmaster.model.Disease;

public interface DiseaseService {

    public Disease saveDisease(Disease disease);
    public List<Disease> getAllDisease();

}
