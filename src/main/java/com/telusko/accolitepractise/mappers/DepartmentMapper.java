package com.telusko.accolitepractise.mappers;

import com.telusko.accolitepractise.dto.DepartmentDto;
import com.telusko.accolitepractise.model.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
    DepartmentDto departmentToDepartmentDto(Department department);
    Department departmentDtoToDepartment(DepartmentDto departmentDto);
    List<DepartmentDto> departmentsToDepartmentDtos(List<Department> departments);
}
