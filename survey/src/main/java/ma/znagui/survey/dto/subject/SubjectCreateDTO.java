package ma.znagui.survey.dto.subject;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.entity.Subject;
import ma.znagui.survey.entity.Survey;
import ma.znagui.survey.validator.api.CheckExisting;
import ma.znagui.survey.validator.api.UniqueName;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectCreateDTO {
    @NotBlank(message = "le titre svp!")
    @UniqueName(fieldName = "title" , entityCl = Subject.class)
    private String title;
    @CheckExisting(entityC = Subject.class)
    private Long editionID;
}
