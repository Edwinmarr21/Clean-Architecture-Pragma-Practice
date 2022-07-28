package com.PragmaCleanArchitecture.infrastructure.databases.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(collection = "Images")
public class ImageEntity {
    @Id
    private String id;
    private String base64Content;
    private String name;
    private String type;
    private Long size;
    @Indexed(unique = true)
    private String personIdentification;
}
