package com.PragmaCleanArchitecture.aplication.service;

import com.PragmaCleanArchitecture.aplication.dto.ImageDto;
import com.PragmaCleanArchitecture.aplication.mapper.ImageMapper;
import com.PragmaCleanArchitecture.domain.entities.ports.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImageServiceImpl implements  ImageServiceInterface{

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public ImageDto insertImage(ImageDto imageDto) {
        return ImageMapper.toImageDto(imageRepository.insertImage(ImageMapper.toImage(imageDto)));
    }

    @Override
    public ImageDto updateImage(ImageDto imageDto) {
        return ImageMapper.toImageDto(imageRepository.updateImage(ImageMapper.toImage(imageDto)));
    }

    @Override
    public void deleteImage(String personIdentification) {
        imageRepository.deleteImage(personIdentification);
    }

    @Override
    public ImageDto getByPersonIdentification(String personIdentification) {
        return ImageMapper.toImageDto(imageRepository.findImageByPersonIdentification(personIdentification));
    }

    @Override
    public List<ImageDto> listImages() {
        return imageRepository.findAll()
                .stream()
                .map(imageEntity -> ImageMapper.toImageDto(imageEntity))
                .collect(Collectors.toList());
    }
}
