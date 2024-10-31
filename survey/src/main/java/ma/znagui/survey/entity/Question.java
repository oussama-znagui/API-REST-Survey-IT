package ma.znagui.survey.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.znagui.survey.enums.QuestionType;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private int answerCount;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    private QuestionType questionType;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

}
