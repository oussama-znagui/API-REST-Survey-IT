package ma.znagui.survey.dto.survey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.dto.owner.OwnerResponseDTO;
import ma.znagui.survey.entity.Owner;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class SurveyCreateDTO {
    private String title;
    private String description;
    private Long ownerID;
}
