package Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class checkforzerovalidator implements ConstraintValidator<checkforZero,String>{

	@Override
	public void initialize(checkforZero constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value.equals(0)) {
			return false;
		}else {
			return true;
		}
	}
	
	

}
