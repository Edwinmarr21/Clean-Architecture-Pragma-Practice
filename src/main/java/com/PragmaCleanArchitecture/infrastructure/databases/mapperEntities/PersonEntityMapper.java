package com.PragmaCleanArchitecture.infrastructure.databases.mapperEntities;

import com.PragmaCleanArchitecture.domain.entities.model.Person;
import com.PragmaCleanArchitecture.infrastructure.databases.Entities.PersonEntity;

public class PersonEntityMapper {
    public static Person toPerson(PersonEntity personEntity){
        Person person = new Person();
        person.setId(personEntity.getId());
        person.setName(personEntity.getName());
        person.setLastName(personEntity.getLastName());
        person.setIdentificationNumber(personEntity.getIdentificationNumber());
        person.setIdentificationType(personEntity.getIdentificationType());
        person.setAge(personEntity.getAge());
        person.setCityOfBirth(personEntity.getCityOfBirth());
        return person;
    }
    public static PersonEntity toPersonEntity(Person person){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(person.getId());
        personEntity.setName(person.getName());
        personEntity.setLastName(person.getLastName());
        personEntity.setIdentificationType(person.getIdentificationType());
        personEntity.setIdentificationNumber(person.getIdentificationNumber());
        personEntity.setAge(person.getAge());
        personEntity.setCityOfBirth(person.getCityOfBirth());
        return personEntity;
    }
}
