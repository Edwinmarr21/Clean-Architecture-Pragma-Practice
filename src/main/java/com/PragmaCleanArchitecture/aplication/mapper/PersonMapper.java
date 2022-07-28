package com.PragmaCleanArchitecture.aplication.mapper;

import com.PragmaCleanArchitecture.aplication.dto.PersonDto;
import com.PragmaCleanArchitecture.domain.entities.model.Person;


public class PersonMapper {

    public static PersonDto toPersonDto(Person person){
        PersonDto personDto = new PersonDto();
        personDto.setName(person.getName());
        personDto.setLastName(person.getLastName());
        personDto.setIdentificationType(person.getIdentificationType());
        personDto.setIdentificationNumber(person.getIdentificationNumber());
        personDto.setAge(person.getAge());
        personDto.setCityOfBirth(person.getCityOfBirth());
        return personDto;
    }

    public static Person toPerson(PersonDto personDto){
        Person person = new Person();
        person.setName(personDto.getName());
        person.setLastName(personDto.getLastName());
        person.setIdentificationNumber(personDto.getIdentificationNumber());
        person.setIdentificationType(personDto.getIdentificationType());
        person.setAge(personDto.getAge());
        person.setCityOfBirth(personDto.getCityOfBirth());
        return person;
    }
}
