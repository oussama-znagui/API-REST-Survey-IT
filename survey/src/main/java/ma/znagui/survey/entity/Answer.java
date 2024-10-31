package ma.znagui.survey.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Answer {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private int AnswerCount;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
