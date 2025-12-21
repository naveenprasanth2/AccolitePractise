package com.telusko.accolitepractise.model;


import jakarta.persistence.*;
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

