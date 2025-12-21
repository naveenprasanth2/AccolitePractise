package com.telusko.accolitepractise.validations.impl;

import com.telusko.accolitepractise.validations.NameValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidationImpl implements ConstraintValidator<NameValidation, String> {
    @Override
    public boolean isValid(String firstName, ConstraintValidatorContext constraintValidatorContext) {
        return firstName != null && !firstName.isEmpty();
    }
}
