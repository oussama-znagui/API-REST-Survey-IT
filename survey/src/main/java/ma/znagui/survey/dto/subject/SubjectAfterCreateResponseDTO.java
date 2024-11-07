package ma.znagui.survey.dto.subject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.znagui.survey.dto.edition.EditionAfterCreateResponseDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectAfterCreateResponseDTO {
    private Long id;
    private String title;
    private EditionAfterCreateResponseDto edition;

}
