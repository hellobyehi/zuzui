package com.zuzui.zuzui.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class buy {
    @Id
    @GeneratedValue

    public long Id;
    public String name;
    public String email;
    public String address;
    public String paymentMethod;
    public String name_card;
    public String card_number;
    public String expiration;
    public String cvv;

    public buy(String name, String email, String address, String paymentMethod, String name_card, String card_number, String expiration, String cvv) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.paymentMethod = paymentMethod;
        this.name_card = name_card;
        this.card_number = card_number;
        this.expiration = expiration;
        this.cvv = cvv;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getName_card() {
        return name_card;
    }

    public void setName_card(String name_card) {
        this.name_card = name_card;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public buy() {
    }
}
