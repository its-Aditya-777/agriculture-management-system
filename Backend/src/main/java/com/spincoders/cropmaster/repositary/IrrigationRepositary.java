package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Irrigation;

@Repository
public interface IrrigationRepositary extends JpaRepository<Irrigation,Integer> {
}
