package com.telusko.accolitepractise.service;

import com.telusko.accolitepractise.model.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    private final List<Department> departments;

    public DepartmentService() {
        this.departments = new ArrayList<>();
    }

    public List<Department> getDepartments() {
        return departments;
    }
    public void setDepartments(List<Department> departments) {
        this.departments.addAll(departments);
    }
    public Department addDepartment(Department department) {
        this.departments.add(department);
        return department;
    }
}
