package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Crop;

@Repository
public interface CropRepositary extends JpaRepository<Crop, Integer> {


}
