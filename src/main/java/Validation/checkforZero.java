package Validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=checkforzerovalidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)


public @interface checkforZero {
	 String message() default "Do Not Input 0";
	    Class<?>[] groups() default {};
	    Class<? extends Payload>[] payload() default {};
	
}
