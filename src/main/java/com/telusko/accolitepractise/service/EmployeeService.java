package com.telusko.accolitepractise.service;

import com.telusko.accolitepractise.repository.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.telusko.accolitepractise.model.Employee;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public Employee findById(int id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }
}
