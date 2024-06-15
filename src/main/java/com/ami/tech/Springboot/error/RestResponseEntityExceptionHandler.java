package com.ami.tech.Springboot.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.ami.tech.Springboot.entity.ErrorMessage;

// this class is responsible for handling the exceptions and what we want to send as a response to the frontend
@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler {
    
    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ErrorMessage> DepartmentNotFoundException(DepartmentNotFoundException exception, WebRequest request){
        ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
    
}
