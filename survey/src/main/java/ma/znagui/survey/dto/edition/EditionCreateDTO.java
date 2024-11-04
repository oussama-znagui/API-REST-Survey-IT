package ma.znagui.survey.dto.edition;



import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.entity.Owner;
import ma.znagui.survey.entity.Survey;
import ma.znagui.survey.entity.SurveyEdition;
import ma.znagui.survey.validator.api.CheckExisting;
import ma.znagui.survey.validator.api.CheckStartDate;
import ma.znagui.survey.validator.api.UniqueName;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditionCreateDTO {


//    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "La date doit être au format YYYY-MM-DD")
    @CheckStartDate
    private String start_date;
//    @UniqueName(fieldName = "years" , entityCl = SurveyEdition.class)
    @NotNull(message = "l'edition Svp ! ")
    private int years;

    @CheckExisting(entityC = Survey.class)
    private Long surveyID;
}
