package ma.znagui.survey.dto.edition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class EditionEmbdedDTO {
    private Long id;
    private LocalDate creation_date;
    private LocalDate start_date;
    private int years;
}
