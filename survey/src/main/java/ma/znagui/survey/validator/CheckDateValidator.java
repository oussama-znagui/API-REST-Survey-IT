package ma.znagui.survey.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ma.znagui.survey.validator.api.CheckStartDate;

import java.time.LocalDate;

public class CheckDateValidator implements ConstraintValidator<CheckStartDate, String> {


    @Override
    public void initialize(CheckStartDate constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String date, ConstraintValidatorContext constraintValidatorContext) {
        if (date == null){
            return false;
        }
        LocalDate today = LocalDate.now();
        if ( date.matches("^\\d{4}-\\d{2}-\\d{2}$")){
            if (today.isBefore(LocalDate.parse(date))){
            return true;
            }
        }
//        if (today.isBefore(LocalDate.parse(date))){
//            return true;
//        }

      return false;


        }

}
