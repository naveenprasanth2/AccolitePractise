package com.telusko.accolitepractise.controller;

import com.telusko.accolitepractise.dto.EmployeeDto;
import com.telusko.accolitepractise.mappers.EmployeeMapper;
import com.telusko.accolitepractise.model.Employee;
import com.telusko.accolitepractise.service.EmployeeService;
import com.telusko.accolitepractise.validations.groups.OnCreate;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int employeeId) {
        return new ResponseEntity<>(employeeService.getEmployee(employeeId), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@Validated(value = OnCreate.class) @RequestBody EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeService.addEmployee(EmployeeMapper.INSTANCE.employeeDtoToEmployee(employeeDto)), HttpStatus.OK);
    }
}
