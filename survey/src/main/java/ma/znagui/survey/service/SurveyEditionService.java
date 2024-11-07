package ma.znagui.survey.service;

import ma.znagui.survey.dto.edition.EditionAfterCreateResponseDto;
import ma.znagui.survey.dto.edition.EditionCreateDTO;
import ma.znagui.survey.dto.edition.EditionResponseDTO;

import java.util.List;

public interface SurveyEditionService {
    public EditionAfterCreateResponseDto createEdition(EditionCreateDTO dto);
    public EditionResponseDTO getEdition(Long id);
    public List<EditionResponseDTO> getAllEditions();
}
