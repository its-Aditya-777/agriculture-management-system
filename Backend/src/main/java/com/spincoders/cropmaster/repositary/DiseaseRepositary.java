package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Disease;

@Repository
public interface DiseaseRepositary extends JpaRepository<Disease, Integer> {
}
