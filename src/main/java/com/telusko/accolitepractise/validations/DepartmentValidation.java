package com.telusko.accolitepractise.validations;

import com.telusko.accolitepractise.validations.impl.DepartmentValidationImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DepartmentValidationImpl.class)
public @interface DepartmentValidation {
    String message() default "Department name is invalid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
