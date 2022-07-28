package com.PragmaCleanArchitecture.infrastructure.databases.dao;

import com.PragmaCleanArchitecture.domain.entities.model.Image;
import com.PragmaCleanArchitecture.infrastructure.databases.Entities.ImageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageDao extends MongoRepository<ImageEntity,String> {
    ImageEntity findByPersonIdentification(String identificationNumber);
}
