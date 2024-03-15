package com.example.demo.entity;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> validationException(MethodArgumentNotValidException ex){
		
		List<ObjectError> allError =ex.getAllErrors();
		HashMap<String, String> map = new HashMap<>();
		
		for(ObjectError error : allError) {
			
			
			String field = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			map.put(field, message);
		}
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
		
	}
	

}
