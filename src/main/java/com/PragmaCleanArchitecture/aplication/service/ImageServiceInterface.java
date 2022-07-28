package com.PragmaCleanArchitecture.aplication.service;

import com.PragmaCleanArchitecture.aplication.dto.ImageDto;

import java.util.List;

public interface ImageServiceInterface {

    ImageDto insertImage(ImageDto imageDto);
    ImageDto updateImage(ImageDto imageDto);
    void deleteImage(String personIdentification);
    ImageDto getByPersonIdentification(String personIdentification);
    List<ImageDto> listImages();


}
