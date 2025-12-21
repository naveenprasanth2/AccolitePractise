package com.telusko.accolitepractise.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Department {
    private Long id;
    private String departmentName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long internalId;
}
