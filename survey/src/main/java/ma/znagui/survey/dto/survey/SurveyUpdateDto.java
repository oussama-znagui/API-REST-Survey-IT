package ma.znagui.survey.dto.survey;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.entity.Owner;
import ma.znagui.survey.entity.Survey;
import ma.znagui.survey.validator.api.CheckExisting;
import ma.znagui.survey.validator.api.UniqueName;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class SurveyUpdateDto {
    @NotBlank(message = "Le titre Svp ! ")
    private String title;
    @NotBlank(message = "La description Svp ! ")
    private String description;
    @NotNull(message = "L'ID du proprietaire Svp ! ")
    @CheckExisting(entityC = Owner.class)
    private Long ownerID;
}
