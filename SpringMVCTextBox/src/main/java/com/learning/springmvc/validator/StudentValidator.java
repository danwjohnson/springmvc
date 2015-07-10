package com.learning.springmvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.learning.springmvc.model.Student;

public class StudentValidator implements Validator{

	public boolean supports(Class<?> paramClass) {
		
		return Student.class.equals(paramClass);
		
	}

	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "name", "valid.name");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "valid.lastName");
		
	}

}
