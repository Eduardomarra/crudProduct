package com.emarra.crudProduct.entities;

public class Product {
    private Long id;
    private String name;
    private String description;
    private Integer price_in_cents;
    private String imgUrl;

    public Product(){}

    public Product(Long id, String name, String description, Integer price_in_cents, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price_in_cents = price_in_cents;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice_in_cents() {
        return price_in_cents;
    }

    public void setPrice_in_cents(Integer price_in_cents) {
        this.price_in_cents = price_in_cents;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
