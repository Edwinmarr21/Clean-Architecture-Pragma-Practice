package com.PragmaCleanArchitecture.domain.entities.ports;

import com.PragmaCleanArchitecture.domain.entities.model.Person;

import java.util.List;

public interface PersonRepository {

    Person insertPerson(Person person);
    Person updatePerson(Person person);
    void deleteById(Long id);
    Person findById(Long id);
    Person findByIdentificationNumber(String identificationNumber);
    List<Person> findAllPeople();


}
