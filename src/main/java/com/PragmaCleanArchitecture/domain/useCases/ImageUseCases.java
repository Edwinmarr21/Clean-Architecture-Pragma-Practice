package com.PragmaCleanArchitecture.domain.useCases;

import com.PragmaCleanArchitecture.domain.entities.model.Image;
import com.PragmaCleanArchitecture.domain.entities.ports.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ImageUseCases {
    @Autowired
    private ImageRepository imageGateway;

    public Image insertImage(Image image){
        return imageGateway.insertImage(image);
    }
    public Image updateImage(Image imageUpdated){
        return imageGateway.updateImage(imageUpdated);
    }
    public void deleteImage(String id){
        imageGateway.deleteImage(id);
    }
    public List<Image> getImages(){
        return imageGateway.findAll();
    }
}
