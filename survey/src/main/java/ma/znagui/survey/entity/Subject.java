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
public class Subject {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private Subject parent;

    @OneToMany(mappedBy = "parent")
    private List<Subject> subjects;


    @OneToMany(mappedBy = "subject")
    private List<Question> questions;




}
