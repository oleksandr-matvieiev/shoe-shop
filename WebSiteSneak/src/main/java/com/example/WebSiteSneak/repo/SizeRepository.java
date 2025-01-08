package com.example.WebSiteSneak.repo;

import com.example.WebSiteSneak.Models.Sizes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SizeRepository extends JpaRepository<Sizes,Long> {


    @Query("SELECT s from Sizes s where s.shoes.shoesId=:shoesId ")
    Iterable<Sizes> findByShoesId(Long shoesId);
}