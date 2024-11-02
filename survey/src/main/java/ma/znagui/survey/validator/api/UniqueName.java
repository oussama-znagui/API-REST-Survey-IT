package ma.znagui.survey.validator.api;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import ma.znagui.survey.validator.UniqueNameValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Constraint(validatedBy ={UniqueNameValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueName {

    String message() default "Le nom existe déjà";


    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
