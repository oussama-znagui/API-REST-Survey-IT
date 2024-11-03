package ma.znagui.survey.mapper;

import ma.znagui.survey.dto.edition.EditionEmbdedDTO;
import ma.znagui.survey.entity.SurveyEdition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class SurveyEditionMapper {

    public abstract EditionEmbdedDTO editionToEmbdedDto(SurveyEdition edition);
}
