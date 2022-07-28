package com.PragmaCleanArchitecture.domain.entities.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String lastName;
    @NotBlank
    @Pattern(regexp = "CEDULA|PASAPORTE")
    private String identificationType;
    private String identificationNumber;
    private int age;
    private String cityOfBirth;


}
