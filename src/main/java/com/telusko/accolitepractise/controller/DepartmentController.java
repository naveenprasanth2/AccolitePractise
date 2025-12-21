package com.telusko.accolitepractise.controller;

import com.telusko.accolitepractise.dto.DepartmentDto;
import com.telusko.accolitepractise.mappers.DepartmentMapper;
import com.telusko.accolitepractise.model.Department;
import com.telusko.accolitepractise.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@AllArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
    @PostMapping("/add")
    public ResponseEntity<DepartmentDto> addDepartment(@RequestBody DepartmentDto departmentDto) {
        Department department = DepartmentMapper.INSTANCE.departmentDtoToDepartment(departmentDto);
        return new ResponseEntity<>(DepartmentMapper.INSTANCE.departmentToDepartmentDto(departmentService.addDepartment(department)), HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<DepartmentDto>> getAllDepartments() {
        return new ResponseEntity<>(DepartmentMapper.INSTANCE.departmentsToDepartmentDtos(departmentService.getAllDepartments()), HttpStatus.OK);
    }
    @GetMapping("/size")
    public ResponseEntity<List<DepartmentDto>> getAllDepartmentsBySize(@RequestParam("page") int page, @RequestParam("size") int size) {
        return new ResponseEntity<>(DepartmentMapper.INSTANCE.departmentsToDepartmentDtos(departmentService.getDepartments(page, size)), HttpStatus.OK);
    }
}
