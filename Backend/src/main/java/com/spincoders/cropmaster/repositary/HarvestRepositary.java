package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Harvest;

@Repository
public interface HarvestRepositary extends JpaRepository<Harvest, Integer> {
}
