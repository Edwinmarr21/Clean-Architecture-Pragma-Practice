package com.PragmaCleanArchitecture.aplication.service;

import com.PragmaCleanArchitecture.aplication.dto.PersonDto;

import java.util.List;

public interface PersonServiceInterface {
    PersonDto insertPerson(PersonDto personDto);
    PersonDto updatePerson(String identificationNumber,PersonDto personDto);
    void deleteByIdentificationNumber(String identificationNumber);
    PersonDto findById(Long id);
    PersonDto findByIdentificationNumber(String identificationNumber);
    List<PersonDto> findAllPeople();
}
