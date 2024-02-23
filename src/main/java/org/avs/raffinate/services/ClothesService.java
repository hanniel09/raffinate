package org.avs.raffinate.services;

import org.avs.raffinate.DTO.clothes.ClothesDTO;
import org.avs.raffinate.domain.clothes.Clothes;
import org.avs.raffinate.exceptions.badrequests.ClothesBadRequestException;
import org.avs.raffinate.repositories.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothesService {

    @Autowired
    ClothesRepository clothesRepository;

    public List<Clothes> findAllClothes(){
        return clothesRepository.findAll();
    }

    public Clothes findById(String id){
        return clothesRepository.findById(id).orElseThrow(() ->
                new ClothesBadRequestException(id));
    }

    public Clothes crateClothes(ClothesDTO data){
        Clothes clothes = new Clothes(data);
        return clothesRepository.save(clothes);
    }

    public Clothes updateClothes(ClothesDTO data, String id){
        Clothes oldClothes = findById(id);
        Clothes newClothes = new Clothes(data);
        newClothes.setId(oldClothes.getId());
        return clothesRepository.save(newClothes);
    }

    public void deleteClothes(String id){
        clothesRepository.deleteById(id);
    }
}
