package com.example.WebSiteSneak.Service;

import com.example.WebSiteSneak.Models.Shoes;
import com.example.WebSiteSneak.repo.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoesService {
    @Autowired
    public ShoesRepository shoesRepository;
    public List<Shoes> getAllShoesBySex(String sex) {
        return shoesRepository.findBySex(sex);
    }
    public List<Shoes> getAllShoes() {
        return shoesRepository.findAll();
    }
    public Optional<Shoes> getShoesById(Long id){
        return shoesRepository.findById(id);
    }
}