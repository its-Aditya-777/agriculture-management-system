package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Machinery;

@Repository
public interface MachineryRepositary extends JpaRepository<Machinery,Integer> {
}
