package ma.znagui.survey.mapper;

import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseAfterCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.entity.Survey;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class SurveyMapper {


    public abstract SurveyResponseAfterCreateDTO surveyToResponseAfterCreateDTO(Survey survey);

    public abstract SurveyResponseDTO surveyToResponseDTO(Survey survey);



    @Mapping(target = "owner.id" , source = "ownerID")
    public abstract Survey  createDTOtoSurvey(SurveyCreateDTO dto);
}

