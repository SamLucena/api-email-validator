package com.example.demo.dto;

import jakarta.validation.constraints.Email;

import java.io.Serializable;


public class EmailDTO implements Serializable {

    @Email(message = "Email is not valid")
    private String email;
    private boolean isValid;

    public EmailDTO(){}

    public EmailDTO(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
