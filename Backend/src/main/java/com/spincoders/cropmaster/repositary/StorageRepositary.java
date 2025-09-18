package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Storage;

@Repository
public interface StorageRepositary extends JpaRepository<Storage, Integer> {
}
