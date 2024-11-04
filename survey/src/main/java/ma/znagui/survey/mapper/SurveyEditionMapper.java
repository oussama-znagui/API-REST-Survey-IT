package ma.znagui.survey.mapper;

import ma.znagui.survey.dto.edition.EditionAfterCreateResponseDto;
import ma.znagui.survey.dto.edition.EditionCreateDTO;
import ma.znagui.survey.dto.edition.EditionEmbdedDTO;
import ma.znagui.survey.dto.edition.EditionResponseDTO;
import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.entity.Survey;
import ma.znagui.survey.entity.SurveyEdition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class SurveyEditionMapper {

    public abstract EditionEmbdedDTO editionToEmbdedDto(SurveyEdition edition);

    public abstract EditionResponseDTO editionToResponseDTO(SurveyEdition edition);



    @Mapping(target = "survey.id" , source = "surveyID")
    public abstract SurveyEdition createDTOtoSurvey(EditionCreateDTO dto);

    public abstract EditionAfterCreateResponseDto editionToAfterCreateDTO(SurveyEdition edition);


}
