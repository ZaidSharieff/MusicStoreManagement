package com.zaid.musicstoremanagement.exceptions;

import com.zaid.musicstoremanagement.dtos.ExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TransactionNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleTransactionNotFoundException(Exception e) {
        return ResponseEntity.status(400).body(new ExceptionDto(e.getMessage(), e.toString()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> handleException(Exception e) {
        return ResponseEntity.status(500).body(new ExceptionDto(e.getMessage(), e.toString()));
    }
}

