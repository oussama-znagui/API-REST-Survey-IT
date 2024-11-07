package ma.znagui.survey.mapper;

import ma.znagui.survey.dto.subject.SubjectAfterCreateResponseDTO;
import ma.znagui.survey.dto.subject.SubjectCreateDTO;
import ma.znagui.survey.dto.subject.SubjectEmbdedDTO;
import ma.znagui.survey.entity.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract  class SubjectMapper {

    public abstract SubjectEmbdedDTO subjectToEmbdedDTO(Subject s);

    @Mapping(target = "edition.id" ,source = "editionID")
    public abstract Subject createDTOtoSubject(SubjectCreateDTO dto);

    public abstract SubjectAfterCreateResponseDTO subjectToAfterCreateDTO(Subject subject);
}
