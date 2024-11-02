package ma.znagui.survey.validator;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ma.znagui.survey.validator.api.UniqueName;

public class UniqueNameValidator implements ConstraintValidator<UniqueName,String> {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void initialize(UniqueName constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        if(name == null || name.isEmpty()){
            return true;
        }
        Long count = (Long) entityManager.createQuery("SELECT COUNT(o) FROM Owner o WHERE lower(o.name) = lower(:name) ").setParameter("name",name).getSingleResult();

        return count == 0;
    }
}
