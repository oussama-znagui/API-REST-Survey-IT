package ma.znagui.survey.repository;

import ma.znagui.survey.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {

}
