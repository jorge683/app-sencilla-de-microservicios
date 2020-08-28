package com.example.kangaroo;

import javax.validation.constraints.Size;

public class PersonDTO {
    @Size(min = 2,max = 100)
    private String name;

    @Size(min = 1,max = 200)
    private String lastName;

    @Size(min = 1,max = 10)
    private String identificationNumber;

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