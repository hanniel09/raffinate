package org.avs.raffinate.controllers;

import org.avs.raffinate.DTO.ClothesDTO;
import org.avs.raffinate.domain.clothes.Clothes;
import org.avs.raffinate.services.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clothes")
public class ClothesController {

    @Autowired
    ClothesService clothesService;

    @GetMapping()
    public ResponseEntity<List<Clothes>> findAllClothes(){
      return new ResponseEntity<>(clothesService.findAllClothes(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Clothes> findClothesById(@PathVariable String id){
        return new ResponseEntity<>(clothesService.findById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Clothes> createClothes(@RequestBody ClothesDTO data){
        return new ResponseEntity<>(clothesService.crateClothes(data), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Clothes> updateClothes(@RequestBody ClothesDTO data, @PathVariable String id){
        return new ResponseEntity<>(clothesService.updateClothes(data, id), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteClothes(@PathVariable String id){
        clothesService.deleteClothes(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
