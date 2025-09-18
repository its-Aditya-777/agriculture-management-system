package com.spincoders.cropmaster.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spincoders.cropmaster.model.Owner;

@Repository
public interface OwnerRepositary extends JpaRepository<Owner, Integer> {

    Owner findByNic(String nic);
}
