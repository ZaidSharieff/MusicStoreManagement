//package com.zaid.musicstoremanagement.globalExceptionHandler;
//
//import com.zaid.musicstoremanagement.dtos.ExceptionDto;
//import com.zaid.musicstoremanagement.exceptions.CategoryNotFoundException;
//import com.zaid.musicstoremanagement.exceptions.ProductNotFoundException;
//import com.zaid.musicstoremanagement.exceptions.SupplierNotFoundException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(ProductNotFoundException.class)
//    public ResponseEntity handleProductNotFoundException() {
//        ExceptionDto dto = new ExceptionDto();
//        dto.setMessage("Something went wrong");
//        dto.setResolution("Product not found exception");
//        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
//        return response;
//    }
//    @ExceptionHandler(CategoryNotFoundException.class)
//    public ResponseEntity handleCategoryNotFoundException() {
//        ExceptionDto dto = new ExceptionDto();
//        dto.setMessage("Something went wrong");
//        dto.setResolution("Category not found exception");
//        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
//        return response;
//    }
//    @ExceptionHandler(SupplierNotFoundException.class)
//    public ResponseEntity handleSupplierNotFoundException() {
//        ExceptionDto dto = new ExceptionDto();
//        dto.setMessage("Something went wrong");
//        dto.setResolution("Supplier not found exception");
//        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
//        return response;
//    }
//}
