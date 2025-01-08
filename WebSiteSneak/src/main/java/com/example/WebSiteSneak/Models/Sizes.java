package com.example.WebSiteSneak.Models;

import jakarta.persistence.*;

@Entity
public class Sizes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long size_id;

    private int size;
    @ManyToOne
    @JoinColumn(name ="shoes_id" )
    private Shoes shoes;

    public Long getSize_id() {
        return size_id;
    }

    public void setSize_id(Long size_id) {
        this.size_id = size_id;
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }
}