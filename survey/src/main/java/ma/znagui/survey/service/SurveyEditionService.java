package ma.znagui.survey.service;

import ma.znagui.survey.dto.edition.EditionAfterCreateResponseDto;
import ma.znagui.survey.dto.edition.EditionCreateDTO;
import ma.znagui.survey.dto.edition.EditionResponseDTO;

public interface SurveyEditionService {
    public EditionAfterCreateResponseDto createEdition(EditionCreateDTO dto);
    public EditionResponseDTO getEdition(Long id);
}
