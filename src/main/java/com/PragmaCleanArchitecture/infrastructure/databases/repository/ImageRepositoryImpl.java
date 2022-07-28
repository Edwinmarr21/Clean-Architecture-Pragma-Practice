package com.PragmaCleanArchitecture.infrastructure.databases.repository;

import com.PragmaCleanArchitecture.infrastructure.databases.dao.ImageDao;
import com.PragmaCleanArchitecture.domain.entities.model.Image;
import com.PragmaCleanArchitecture.domain.entities.ports.ImageRepository;
import com.PragmaCleanArchitecture.infrastructure.databases.mapperEntities.ImageEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository

public class ImageRepositoryImpl implements ImageRepository {
    @Autowired
    private ImageDao imageDao;

    @Override
    public Image insertImage(Image image) {
        return ImageEntityMapper.toImage(imageDao.insert(ImageEntityMapper.toImageEntity(image)));
    }

    @Override
    public Image updateImage(Image image) {
        return ImageEntityMapper.toImage(imageDao.save(ImageEntityMapper.toImageEntity(image)));
    }

    @Override
    public void deleteImage(String id) {
        imageDao.deleteById(id);
    }

    @Override
    public Image findImageByid(String id) {
        return ImageEntityMapper.toImage(imageDao.findById(id).get());
    }

    @Override
    public Image findImageByPersonIdentification(String identificationNumber) {
        return ImageEntityMapper.toImage(imageDao.findByPersonIdentification(identificationNumber));
    }

    @Override
    public List<Image> findAll() {
        return imageDao.findAll().stream().map(imageEntity -> ImageEntityMapper.toImage(imageEntity)).collect(Collectors.toList());
    }
}
