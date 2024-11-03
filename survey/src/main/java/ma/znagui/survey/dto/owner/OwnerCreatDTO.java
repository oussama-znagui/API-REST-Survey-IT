package ma.znagui.survey.dto.owner;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ma.znagui.survey.entity.Owner;
import ma.znagui.survey.validator.api.UniqueName;
@Data

@AllArgsConstructor
@NoArgsConstructor

public class OwnerCreatDTO {
    @NotEmpty(message = "Le nom ne peut pas etre vide")
    @UniqueName(fieldName = "name",entityCl = Owner.class)
    private String name;


}
