package com.PragmaCleanArchitecture.infrastructure.databases.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "people")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true)
    private Long id;
    private String name;
    private String lastName;
    @NotBlank
    @Pattern(regexp = "CEDULA|PASAPORTE")
    private String identificationType;
    @Column(name = "identificationNumber",unique = true)
    private String identificationNumber;
    private int age;
    private String cityOfBirth;
}
