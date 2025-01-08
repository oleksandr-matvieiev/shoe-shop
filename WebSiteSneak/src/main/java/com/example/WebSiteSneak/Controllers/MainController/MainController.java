package com.example.WebSiteSneak.Controllers.MainController;


import com.example.WebSiteSneak.Models.Shoes;
import com.example.WebSiteSneak.Models.Sizes;
import com.example.WebSiteSneak.Models.ToSend;
import com.example.WebSiteSneak.Service.ShoesService;
import com.example.WebSiteSneak.Service.SizeService;
import com.example.WebSiteSneak.repo.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class MainController {


    @Autowired
    private ShoesService shoesService;
    @Autowired
    private SizeRepository sizeRepository;
    @Autowired
    private SizeService sizeService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/api/shoes/list/{sex}")
    public ResponseEntity<Object> getAllShoesBySex(@PathVariable String sex) {
        if (sex.equals("all")) return new ResponseEntity<>(shoesService.getAllShoes(), HttpStatus.OK);
        List<Shoes> shoes=shoesService.getAllShoesBySex(sex);
        return new ResponseEntity<>(shoes, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/api/shoes/{id}")
    public ResponseEntity<Object> getShoesById(@PathVariable Long id) {

        Optional<Shoes> shoes = shoesService.getShoesById(id);
        Iterable<Sizes> sizesList = sizeRepository.findByShoesId(shoes.get().getShoesId());
        ToSend toSend=new ToSend(shoes,sizesList);
        return new ResponseEntity<>(toSend, HttpStatus.OK);
    }



}