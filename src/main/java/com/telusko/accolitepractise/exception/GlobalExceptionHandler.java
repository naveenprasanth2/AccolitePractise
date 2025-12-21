package com.telusko.accolitepractise.exception;

import com.telusko.accolitepractise.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Objects;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class, NameNotValidException.class})
    public ResponseEntity<Object> handleMethodArgumentNotValidException(Exception ex, WebRequest request) {
        if (ex instanceof MethodArgumentNotValidException error) {
            return new ResponseEntity<>(new ExceptionDto(Objects.requireNonNull(error.getBindingResult().getFieldError()).getDefaultMessage(), 600), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new ExceptionDto(ex.getMessage(), 600), HttpStatus.BAD_REQUEST);
    }
}
