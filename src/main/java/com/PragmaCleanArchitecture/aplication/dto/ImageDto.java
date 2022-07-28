package com.PragmaCleanArchitecture.aplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageDto {
    private String base64Content;
    private String name;
    private String type;
    private Long size;
    private String personIdentification;
}
