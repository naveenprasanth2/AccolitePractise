package com.telusko.accolitepractise.dto;

import java.util.List;

public record DepartmentDto(Long id, String departmentName, List<EmployeeDto> employees) {
}
