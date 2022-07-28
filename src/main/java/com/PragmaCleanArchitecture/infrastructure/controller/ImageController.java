package com.PragmaCleanArchitecture.infrastructure.controller;

import com.PragmaCleanArchitecture.aplication.dto.ImageDto;
import com.PragmaCleanArchitecture.aplication.mapper.ImageMapper;
import com.PragmaCleanArchitecture.aplication.service.ImageServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1/Images")
public class ImageController {
    @Autowired
    private ImageServiceInterface imageService;

    @PostMapping("/{id}")
    public ResponseEntity<ImageDto> insertImage(@RequestParam("file") MultipartFile file,
                                                @PathVariable(value = "id")String identificationNumber) throws IOException {
        ImageDto imageDto = ImageMapper.toImageDto(file, identificationNumber);
        return ResponseEntity.status(HttpStatus.CREATED).body(imageService.insertImage(imageDto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ImageDto> getImage(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(imageService.getByPersonIdentification(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<ImageDto> updateImage(@RequestParam("file") MultipartFile file,
                                                @PathVariable(value = "id")String identificationNumber) throws IOException{
        ImageDto imageDto = ImageMapper.toImageDto(file, identificationNumber);
        return ResponseEntity.status(HttpStatus.CREATED).body(imageService.updateImage(imageDto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteImage(@PathVariable String id){
        imageService.deleteImage(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @GetMapping("/listImages")
    public ResponseEntity<List<ImageDto>> listImages(){
        return ResponseEntity.status(HttpStatus.OK).body(imageService.listImages());
    }

}
