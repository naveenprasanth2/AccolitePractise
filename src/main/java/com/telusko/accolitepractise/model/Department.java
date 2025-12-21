package com.telusko.accolitepractise.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.util.List;

@Data
public class Department {
    private Long id;
    private String departmentName;
    private List<Employee> employees;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long internalId;
}
