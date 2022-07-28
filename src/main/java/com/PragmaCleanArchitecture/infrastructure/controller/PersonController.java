package com.PragmaCleanArchitecture.infrastructure.controller;

import com.PragmaCleanArchitecture.aplication.dto.PersonDto;
import com.PragmaCleanArchitecture.aplication.service.PersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    @Autowired
    private PersonServiceInterface personService;

    @PostMapping
    public ResponseEntity<PersonDto> insertPerson(@RequestBody @Valid PersonDto personDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.insertPerson(personDto));
    }
    @GetMapping("/{identificationNumber}")
    public ResponseEntity<PersonDto> getPersonByIdentificationNumber(@PathVariable String identificationNumber){
        return ResponseEntity.ok(personService.findByIdentificationNumber(identificationNumber));
    }
    @PutMapping("/{identificationNumber}")
    public ResponseEntity<PersonDto> updatePersonByIdentificationNumber(
            @PathVariable String identificationNumber,
            @RequestBody PersonDto personDto){
        return ResponseEntity.ok(personService.updatePerson(identificationNumber,personDto));
    }
    @DeleteMapping("/{identificationNumber}")
    public ResponseEntity<?> deletePersonByIdentificationNumber(@PathVariable String identificationNumber){
        personService.deleteByIdentificationNumber(identificationNumber);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @GetMapping("/ListEverybody")
    public ResponseEntity<List<PersonDto>> listPeople(){
        return ResponseEntity.status(HttpStatus.OK).body(personService.findAllPeople());
    }


}
