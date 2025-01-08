package com.example.WebSiteSneak.Service;

import com.example.WebSiteSneak.Models.Sizes;
import com.example.WebSiteSneak.repo.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {
    @Autowired
    SizeRepository sizeRepository;
    public Iterable<Sizes> getSizeByShoesId(Long id){
        return sizeRepository.findByShoesId(id);
    }

}