package ma.znagui.survey.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SurveyEdition {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate creation_date;
    private LocalDate start_date;
    private int years;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;


}
