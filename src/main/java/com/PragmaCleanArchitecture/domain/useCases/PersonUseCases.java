package com.PragmaCleanArchitecture.domain.useCases;

import com.PragmaCleanArchitecture.domain.entities.model.Person;
import com.PragmaCleanArchitecture.domain.entities.ports.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
public class PersonUseCases {

    private final PersonRepository personGateway;

    public Person createPerson(Person newPerson){
        return personGateway.insertPerson(newPerson);
    }
    public Person updatePerson(Person newPerson){
        return personGateway.updatePerson(newPerson);
    }
    public void deletePerson(Long id){personGateway.deleteById(id);}
    public Person getPersonById(Long id){return personGateway.findById(id);}
    public Person getByIdentificationNumber(String identificationNumber){return personGateway.findByIdentificationNumber(identificationNumber);}
    public List<Person> findAll(){
        return personGateway.findAllPeople();
    }

}
