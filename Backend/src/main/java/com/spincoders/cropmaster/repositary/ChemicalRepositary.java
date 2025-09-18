package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Chemical;

@Repository
public interface ChemicalRepositary extends JpaRepository<Chemical, Integer> {
}
