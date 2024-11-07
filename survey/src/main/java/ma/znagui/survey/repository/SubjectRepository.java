package ma.znagui.survey.repository;

import ma.znagui.survey.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {

}
