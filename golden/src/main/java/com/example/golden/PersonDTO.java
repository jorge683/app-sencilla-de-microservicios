package com.example.golden;

import javax.validation.constraints.NotNull;

public class PersonDTO {
    private String name;

    private String lastName;

    private String identificationNumber;

    public PersonDTO() {
    }

    public PersonDTO(String name, String lastName, @NotNull String identificationNumber) {
        this.name = name;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public String toString() {
        return "PersonDTO [identificationNumber=" + identificationNumber + ", lastName=" + lastName + ", name=" + name
                + "]";
    }

}