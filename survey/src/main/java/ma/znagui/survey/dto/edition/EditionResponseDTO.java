package ma.znagui.survey.dto.edition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.dto.subject.SubjectEmbdedDTO;
import ma.znagui.survey.dto.survey.SurveyResponseAfterCreateAndUpdateDTO;
import ma.znagui.survey.entity.Subject;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditionResponseDTO {
    private Long id;
    private LocalDate creation_date;
    private LocalDate start_date;
    private int years;
    private SurveyResponseAfterCreateAndUpdateDTO survey;
    private List<SubjectEmbdedDTO> subjects;
}
