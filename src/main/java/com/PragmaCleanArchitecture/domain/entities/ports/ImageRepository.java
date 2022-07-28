package com.PragmaCleanArchitecture.domain.entities.ports;

import com.PragmaCleanArchitecture.domain.entities.model.Image;

import java.util.List;

public interface ImageRepository {

    Image insertImage(Image image);
    Image updateImage(Image image);
    void deleteImage(String id);
    Image findImageByid(String id);
    Image findImageByPersonIdentification(String identificationNumber);
    List<Image> findAll();


}
