package com.spincoders.cropmaster.service;

import java.util.List;

import com.spincoders.cropmaster.model.Storage;

public interface StorageService {

    public Storage saveStorage(Storage storage);

    public List<Storage> getAllStorage();
}
