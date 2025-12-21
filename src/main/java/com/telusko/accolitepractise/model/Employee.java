package com.telusko.accolitepractise.model;

import com.telusko.accolitepractise.validations.NameValidation;
import com.telusko.accolitepractise.validations.groups.OnCreate;
import lombok.Data;

@Data
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private int phoneNumber;
    private String email;

    @Override
    public boolean equals (Object o){
        if (o instanceof Employee e){
           return e.id == this.id;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

}
