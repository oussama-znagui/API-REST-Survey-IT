package ma.znagui.survey.service.Impl;

import ma.znagui.survey.dto.edition.EditionAfterCreateResponseDto;
import ma.znagui.survey.dto.edition.EditionCreateDTO;
import ma.znagui.survey.dto.edition.EditionEmbdedDTO;
import ma.znagui.survey.dto.edition.EditionResponseDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.entity.SurveyEdition;
import ma.znagui.survey.exeption.ResourceNotFoundException;
import ma.znagui.survey.mapper.SurveyEditionMapper;
import ma.znagui.survey.repository.SurveyEditionRepository;
import ma.znagui.survey.service.SurveyEditionService;
import ma.znagui.survey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SurveyEditionServiceImpl implements SurveyEditionService {
    @Autowired
    SurveyEditionRepository repository;
    @Autowired
    SurveyEditionMapper mapper;
    @Autowired
    SurveyService surveyService;

    public EditionAfterCreateResponseDto createEdition(EditionCreateDTO dto) {
        SurveyEdition edition = mapper.createDTOtoSurvey(dto);
        LocalDate today = LocalDate.now();
        edition.setCreation_date(today);
        SurveyEdition created = repository.save(edition);
        created.setSurvey(surveyService.getSurveyEntityByID(created.getSurvey().getId()));
        return mapper.editionToAfterCreateDTO(created);
    }

    public EditionResponseDTO getEdition(Long id) {
        SurveyEdition surveyEdition = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("edition", id));
        EditionResponseDTO surveyResponseDTO = mapper.editionToResponseDTO(surveyEdition);
        return surveyResponseDTO;
    }
}
