package com.PragmaCleanArchitecture.aplication.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private String name;
    private String lastName;
    @NotBlank
    @Pattern(regexp = "CEDULA|PASAPORTE")
    private String identificationType;
    private String identificationNumber;
    private int age;
    private String cityOfBirth;
}
