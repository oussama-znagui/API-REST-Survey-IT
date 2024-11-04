package ma.znagui.survey.mapper;

import ma.znagui.survey.dto.subject.SubjectEmbdedDTO;
import ma.znagui.survey.entity.Subject;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract  class SubjectMapper {

    public abstract SubjectEmbdedDTO subjectToEmbdedDTO(Subject s);
}
