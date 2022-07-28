package com.PragmaCleanArchitecture.infrastructure.databases.repository;

import com.PragmaCleanArchitecture.infrastructure.databases.dao.PersonDao;
import com.PragmaCleanArchitecture.domain.entities.model.Person;
import com.PragmaCleanArchitecture.domain.entities.ports.PersonRepository;
import com.PragmaCleanArchitecture.infrastructure.databases.mapperEntities.PersonEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private PersonDao personDao;
    @Override
    public Person insertPerson(Person person) {
        return PersonEntityMapper.toPerson(personDao.save(PersonEntityMapper.toPersonEntity(person)));
    }

    @Override
    public Person updatePerson(Person person) {
        return PersonEntityMapper.toPerson(personDao.saveAndFlush(PersonEntityMapper.toPersonEntity(person)));
    }

    @Override
    public void deleteById(Long id) {
        personDao.delete(personDao.findById(id).get());
    }

    @Override
    public Person findById(Long id) {
        return PersonEntityMapper.toPerson(personDao.findById(id).get());
    }

    @Override
    public Person findByIdentificationNumber(String identificationNumber) {
        return PersonEntityMapper.toPerson(personDao.findByIdentificationNumber(identificationNumber));
    }

    @Override
    public List<Person> findAllPeople() {
        return personDao.findAll()
                .stream()
                .map(personEntity -> PersonEntityMapper.toPerson(personEntity))
                .collect(Collectors.toList());
    }
}
