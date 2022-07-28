package com.PragmaCleanArchitecture.aplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonImageDto {
    private String fullName;
    private String identificationType;
    private String identificationNumber;
    private int age;
    private String cityOfBirth;
    private String base64Content;
}
