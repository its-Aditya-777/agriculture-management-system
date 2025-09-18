package com.spincoders.cropmaster.service;

import java.util.List;

import com.spincoders.cropmaster.model.Chemical;

public interface ChemicalService {
    public Chemical saveChemical(Chemical chemical);
    public List<Chemical> getAllChemical();
}
