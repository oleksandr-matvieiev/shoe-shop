package com.example.WebSiteSneak.Models;

import java.util.List;
import java.util.Optional;

public class ToSend {
    private Optional<Shoes> shoes;
    private Iterable<Sizes> sizesList;

    public Optional<Shoes> getShoes() {
        return this.shoes;
    }
    public Iterable<Sizes> getSizesList() {
        return this.sizesList;
    }
    public ToSend(Optional<Shoes> shoes, Iterable<Sizes> sizesList) {
        this.shoes = shoes;
        this.sizesList = sizesList;
    }
}