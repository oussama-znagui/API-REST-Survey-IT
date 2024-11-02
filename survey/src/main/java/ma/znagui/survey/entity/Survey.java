package ma.znagui.survey.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Survey {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="owner_id")
    private Owner owner ;

    @OneToMany(mappedBy = "survey")
    private List<SurveyEdition> surveyEditions;





}
