package ma.znagui.survey.validator;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ma.znagui.survey.exeption.ResourceNotFoundException;
import ma.znagui.survey.validator.api.CheckExisting;

public class CheckExistingValidator implements ConstraintValidator<CheckExisting,Long> {
    @PersistenceContext
    private EntityManager entityManager;

    private Class<?> entityC;

    public void initialize(CheckExisting constraintAnnotation) {
        this.entityC = constraintAnnotation.entityC();
    }



    public boolean isValid(Long aLong, ConstraintValidatorContext constraintValidatorContext) {
        if (aLong == null){
            return true;

        }
        Long count = (Long) entityManager.createQuery("SELECT COUNT(*) FROM " + entityC.getSimpleName() + " e WHERE e.id = :id ").setParameter("id",aLong).getSingleResult();

        if(count == 0){
            throw new ResourceNotFoundException(entityC.getSimpleName(),aLong);
        }
        return true;
    }
}
