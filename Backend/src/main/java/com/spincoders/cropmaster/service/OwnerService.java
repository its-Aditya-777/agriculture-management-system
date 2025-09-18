package com.spincoders.cropmaster.service;

import org.springframework.http.ResponseEntity;

import com.spincoders.cropmaster.model.Farmer;
import com.spincoders.cropmaster.model.Owner;

public interface OwnerService {

    public Owner saveOwner(Owner owner);

    public ResponseEntity<String> authenticateOwner(String nic, String password);

    public Owner findByNic(String nic);

}
