package ma.znagui.survey.repository;

import ma.znagui.survey.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,Long> {

}
