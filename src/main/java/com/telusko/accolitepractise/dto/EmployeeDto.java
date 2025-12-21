package com.telusko.accolitepractise.dto;

import com.telusko.accolitepractise.validations.NameValidation;
import com.telusko.accolitepractise.validations.groups.OnCreate;

public record EmployeeDto(
        int id,
        @NameValidation(groups = OnCreate.class, message = "Please give the right name")
        String firstName,
        String lastName,
        double salary,
        int phoneNumber,
        String email,
        Long departmentId
) {
}
