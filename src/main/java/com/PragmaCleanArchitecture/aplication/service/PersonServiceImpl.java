package com.PragmaCleanArchitecture.aplication.service;

import com.PragmaCleanArchitecture.aplication.dto.PersonDto;
import com.PragmaCleanArchitecture.aplication.mapper.PersonMapper;
import com.PragmaCleanArchitecture.domain.entities.model.Person;
import com.PragmaCleanArchitecture.domain.entities.ports.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonServiceInterface{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDto insertPerson(PersonDto personDto) {
        return PersonMapper.toPersonDto(personRepository.insertPerson(PersonMapper.toPerson(personDto)));
    }

    @Override
    public PersonDto updatePerson(String identificationNumber,PersonDto personDto) {
        Person personUpdated = personRepository.findByIdentificationNumber(identificationNumber);
        personUpdated.setName(personDto.getName());
        personUpdated.setLastName(personDto.getLastName());
        personUpdated.setIdentificationNumber(personDto.getIdentificationNumber());
        personUpdated.setIdentificationType(personDto.getIdentificationType());
        personUpdated.setAge(personDto.getAge());
        personUpdated.setCityOfBirth(personDto.getCityOfBirth());
        return PersonMapper.toPersonDto(personRepository.updatePerson(personUpdated));
    }

    @Override
    public void deleteByIdentificationNumber(String identificationNumber) {
        Person person = personRepository.findByIdentificationNumber(identificationNumber);
        personRepository.deleteById(person.getId());
    }

    @Override
    public PersonDto findById(Long id) {
        return PersonMapper.toPersonDto(personRepository.findById(id));
    }

    @Override
    public PersonDto findByIdentificationNumber(String identificationNumber) {
        return PersonMapper.toPersonDto(personRepository.findByIdentificationNumber(identificationNumber));
    }


    @Override
    public List<PersonDto> findAllPeople() {
        return personRepository.findAllPeople().stream()
                .map(person -> PersonMapper.toPersonDto(person))
                .collect(Collectors.toList());
    }
}
