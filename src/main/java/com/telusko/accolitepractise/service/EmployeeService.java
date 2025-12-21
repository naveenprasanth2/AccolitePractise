package com.telusko.accolitepractise.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telusko.accolitepractise.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Getter
@Service
public class EmployeeService {
    private final List<Employee> employees;

    @Autowired
    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    public void setEmployees(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employees.getLast();
    }
}
