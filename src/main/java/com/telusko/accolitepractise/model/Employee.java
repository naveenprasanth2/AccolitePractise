package com.telusko.accolitepractise.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
