package ma.znagui.survey.mapper;

import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.entity.Owner;
import ma.znagui.survey.entity.Survey;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class SurveyMapper {
    @Autowired
    OwnerMapper ownerMapper;


    public Owner getOwner(Long id){
        Owner o = new Owner();
        o.setId(id);
        return o;
    }

    @Mapping(target = "owner" , expression = "java(ownerMapper.ownerToResponseDTO(survey.getOwner()))")
    public abstract SurveyResponseDTO surveyToResponseDTO(Survey survey);

    @Mapping(target = "owner",expression = "java(getOwner(dto.getOwnerID()))")
    public abstract Survey  createDTOtoSurvey(SurveyCreateDTO dto);
}

