package ma.znagui.survey.validator;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ma.znagui.survey.validator.api.UniqueName;

public class UniqueNameValidator implements ConstraintValidator<UniqueName,String> {

        @PersistenceContext
        private EntityManager entityManager;

    private String field;

    private Class<?> entityC;



    @Override
    public void initialize(UniqueName constraintAnnotation) {
       this.field = constraintAnnotation.fieldName();
       this.entityC = constraintAnnotation.entityCl();
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        if(name == null || name.isEmpty()){
            return true;
        }
        Long count = (Long) entityManager.createQuery("SELECT COUNT(o) FROM "+ entityC.getSimpleName()+" o WHERE lower(o."+field+") = lower(:name) ").setParameter("name",name).getSingleResult();

        return count == 0;
    }
}
