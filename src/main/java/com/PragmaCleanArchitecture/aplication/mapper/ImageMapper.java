package com.PragmaCleanArchitecture.aplication.mapper;

import com.PragmaCleanArchitecture.aplication.dto.ImageDto;
import com.PragmaCleanArchitecture.domain.entities.model.Image;
import com.PragmaCleanArchitecture.infrastructure.controller.util.Base64Converter;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class ImageMapper {
    public static ImageDto toImageDto(MultipartFile file,String personIdentification) throws IOException {
        ImageDto imageDto = new ImageDto();
        imageDto.setName(file.getOriginalFilename());
        imageDto.setType(file.getContentType());
        imageDto.setBase64Content(Base64Converter.toBase64(file));
        imageDto.setPersonIdentification(personIdentification);
        imageDto.setSize(file.getSize());
        return imageDto;
    }

    public static ImageDto toImageDto(Image image){
        ImageDto imageDto = new ImageDto();
        imageDto.setName(image.getName());
        imageDto.setType(image.getType());
        imageDto.setBase64Content(image.getBase64Content());
        imageDto.setPersonIdentification(image.getPersonIdentification());
        imageDto.setSize(image.getSize());
        return imageDto;
    }
    public static Image toImage(ImageDto imageDto){
        Image image = new Image();
        image.setName(imageDto.getName());
        image.setType(imageDto.getType());
        image.setBase64Content(imageDto.getBase64Content());
        image.setPersonIdentification(imageDto.getPersonIdentification());
        image.setSize(imageDto.getSize());
        return image;
    }
}
