package com.PragmaCleanArchitecture.infrastructure.databases.dao;

import com.PragmaCleanArchitecture.infrastructure.databases.Entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<PersonEntity,Long> {
    PersonEntity findByIdentificationNumber(String identificationNumber);
}
