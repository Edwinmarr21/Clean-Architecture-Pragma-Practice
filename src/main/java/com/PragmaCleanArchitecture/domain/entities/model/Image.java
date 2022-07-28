package com.PragmaCleanArchitecture.domain.entities.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    private String id;
    private String base64Content;
    private String name;
    private String type;
    private Long size;
    private String personIdentification;
}
