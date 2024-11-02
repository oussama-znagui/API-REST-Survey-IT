package ma.znagui.survey.dto.survey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.dto.edition.EditionResponseDTO;
import ma.znagui.survey.dto.owner.OwnerResponseDTO;

import java.util.List;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class SurveyResponseDTO {
    private Long id;
    private String title;
    private String description;
    private OwnerResponseDTO owner;
//    private List<EditionResponseDTO> editions;

}
