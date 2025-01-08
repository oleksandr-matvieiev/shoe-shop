package com.example.WebSiteSneak.Models;

import jakarta.persistence.*;

@Entity
public class Shoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shoes_id")
    private Long shoesId;
    private String shoes_name;
    private String shoes_article;
    private String sex;
    private int price;
    private String photo_url;
    private String description;
    private String color;

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getShoesId() {
        return this.shoesId;
    }

    public void setShoesId(Long shoes_id) {
        this.shoesId = shoes_id;
    }

    public String getShoes_name() {
        return this.shoes_name;
    }

    public void setShoes_name(String shoes_name) {
        this.shoes_name = shoes_name;
    }

    public String getShoes_article() {
        return this.shoes_article;
    }

    public void setShoes_article(String shoes_article) {
        this.shoes_article = shoes_article;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoto_url() {
        return this.photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }



    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}