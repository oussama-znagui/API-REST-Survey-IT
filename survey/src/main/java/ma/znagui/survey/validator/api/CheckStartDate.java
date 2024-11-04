package ma.znagui.survey.validator.api;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import ma.znagui.survey.validator.CheckDateValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Constraint(validatedBy = CheckDateValidator.class)
@Retention(RetentionPolicy.RUNTIME)

public @interface CheckStartDate {
    String message() default "La date est invalide";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
