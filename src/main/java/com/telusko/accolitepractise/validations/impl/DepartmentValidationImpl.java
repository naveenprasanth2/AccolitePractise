package com.telusko.accolitepractise.validations.impl;

import com.telusko.accolitepractise.validations.DepartmentValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class DepartmentValidationImpl implements ConstraintValidator<DepartmentValidation, String> {

    private final Pattern departmentNamePattern = Pattern.compile("[a-zA-Z]{3,}");

    @Override
    public boolean isValid(String departmentName, ConstraintValidatorContext context) {
        return departmentNamePattern.matcher(departmentName).matches();
    }
}
