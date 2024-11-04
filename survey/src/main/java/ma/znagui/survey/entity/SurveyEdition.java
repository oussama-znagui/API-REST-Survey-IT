package ma.znagui.survey.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SurveyEdition {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private LocalDate creation_date;
    @Column(nullable = false)
    private LocalDate start_date;
    @Column(nullable = false)
    private int years;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @OneToMany(mappedBy = "surveyEdition")
   private List<Subject> subjects;



}
