package ma.znagui.survey.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import java.util.List;
@Data

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Owner {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Le nom du prorietaire ne peut pas etre vide")
    private String name;

    @OneToMany(mappedBy = "owner")
    private List<Survey> surveys;




}
