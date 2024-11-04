package ma.znagui.survey.dto.edition;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.dto.survey.SurveyResponseAfterCreateAndUpdateDTO;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditionAfterCreateResponseDto {
    private Long id;
    private LocalDate creation_date;
    private LocalDate start_date;
    private int years;
    private SurveyResponseAfterCreateAndUpdateDTO survey;

}
