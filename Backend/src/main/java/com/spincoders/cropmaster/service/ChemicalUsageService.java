package com.spincoders.cropmaster.service;

import java.util.List;

import com.spincoders.cropmaster.model.ChemicalUsage;

public interface ChemicalUsageService {

    public ChemicalUsage saveChemicalUsage(ChemicalUsage chemicalUsage);

    public List<ChemicalUsage> getAllChemicalUsage();

    public List<Object[]> getChemicalIdsAndNicsByFarmlandID(int farmlandID);

    public List<ChemicalUsage> getChemicalByFarmland(int farmlandID);
}
