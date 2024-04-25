package com.emarra.crudProduct.dtos;

import com.emarra.crudProduct.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {

    private Long id;
    @NotBlank(message = "Campo requerido.")
    @Size(min = 3, max = 80, message = "Campo de conter entre 3 e 80 caracteres.")
    private String name;
    @NotBlank(message = "Campo requerido.")
    @Size(min = 10, message = "Campo de conter um mínimo de 10 caracteres.")
    private String description;
    @Positive(message = "Campo deve possuir numero maior que zero.")
    private Integer price_in_cents;
    @NotBlank(message = "Campo requerido.")
    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Integer price_in_cents, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price_in_cents = price_in_cents;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();;
        price_in_cents = product.getPrice_in_cents();
        imgUrl = product.getImgUrl();;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice_in_cents() {
        return price_in_cents;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
