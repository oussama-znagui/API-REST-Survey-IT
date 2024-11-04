package ma.znagui.survey.dto.survey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.dto.owner.OwnerResponseDTO;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class SurveyResponseAfterCreateAndUpdateDTO {
    private Long id;
    private String title;
    private String description;
    private OwnerResponseDTO owner;


}
