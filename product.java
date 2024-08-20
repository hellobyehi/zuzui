package com.zuzui.zuzui.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class product {
    @Id
    @GeneratedValue
    public Long id;
    public String product_name;
    public Integer price;
    public Integer stock;
    public String description;
    public Integer quantity;
    public String image_name;

    public product(String product_name, Integer price, Integer stock, String description, Integer quantity, String image_name) {
        this.product_name = product_name;
        this.price = price;
        this.stock = stock;
        this.description = description;
        this.quantity = quantity;
        this.image_name = image_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public product() {
    }
}
