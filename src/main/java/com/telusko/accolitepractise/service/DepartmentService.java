package com.telusko.accolitepractise.service;

import com.telusko.accolitepractise.model.Department;
import com.telusko.accolitepractise.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DepartmentService {
    private final DepartmentRepo departmentRepo;
    @Autowired
    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }
    public void setDepartments(List<Department> departments) {
        this.departmentRepo.saveAll(departments);
    }
    public Department addDepartment(Department department) {
        departmentRepo.save(department);
        return department;
    }
    public List<Department> getDepartments(int page, int size) {
        Sort sort = Sort.by(Sort.Direction.ASC, "departmentName");
        Pageable pageable = PageRequest.of(page, size, sort);
        return  departmentRepo.findAll(pageable).getContent();
    }

    public Department getDepartmentById(long id) {
        return departmentRepo.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
