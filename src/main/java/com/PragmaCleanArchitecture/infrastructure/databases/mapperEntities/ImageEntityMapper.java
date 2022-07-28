package com.PragmaCleanArchitecture.infrastructure.databases.mapperEntities;

import com.PragmaCleanArchitecture.domain.entities.model.Image;
import com.PragmaCleanArchitecture.infrastructure.databases.Entities.ImageEntity;

public class ImageEntityMapper {
    public static Image toImage(ImageEntity imageEntity) {
        Image image = new Image();
        image.setId(imageEntity.getId());
        image.setName(imageEntity.getName());
        image.setBase64Content(imageEntity.getBase64Content());
        image.setType(imageEntity.getType());
        image.setSize(imageEntity.getSize());
        image.setPersonIdentification(imageEntity.getPersonIdentification());
        return image;
    }
    public static ImageEntity toImageEntity(Image image) {
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setId(image.getId());
        imageEntity.setName(image.getName());
        imageEntity.setBase64Content(image.getBase64Content());
        imageEntity.setType(image.getType());
        imageEntity.setSize(image.getSize());
        imageEntity.setPersonIdentification(image.getPersonIdentification());
        return imageEntity;
    }
}
