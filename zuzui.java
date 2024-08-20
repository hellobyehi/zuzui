package com.zuzui.zuzui.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class zuzui {
    @Id
    @GeneratedValue

    public Long id;
    public String email;
    public String username;
    public String password;
    public String cpassword;

    public zuzui(String email, String username, String password, String cpassword) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.cpassword = cpassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public zuzui() {
    }
}


