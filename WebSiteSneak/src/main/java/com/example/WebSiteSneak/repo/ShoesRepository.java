package com.example.WebSiteSneak.repo;

import com.example.WebSiteSneak.Models.Shoes;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes,Long> {
    @Query("select s from Shoes s where s.sex=:sex")
    List<Shoes> findBySex(String sex);
}
