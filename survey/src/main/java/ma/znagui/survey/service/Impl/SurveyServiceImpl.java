package ma.znagui.survey.service.Impl;

import ma.znagui.survey.dto.edition.EditionEmbdedDTO;
import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseAfterCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.entity.Survey;
import ma.znagui.survey.entity.SurveyEdition;
import ma.znagui.survey.exeption.ResourceNotFoundException;
import ma.znagui.survey.mapper.SurveyEditionMapper;
import ma.znagui.survey.mapper.SurveyMapper;
import ma.znagui.survey.repository.SurveyRepository;
import ma.znagui.survey.service.OwnerService;
import ma.znagui.survey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SurveyServiceImpl implements SurveyService {
    @Autowired
    SurveyRepository repository;
    @Autowired
    SurveyMapper mapper;
    @Autowired
    SurveyEditionMapper editionMapper;
    @Autowired
    OwnerService ownerService;
    public SurveyResponseAfterCreateDTO saveSurvey(SurveyCreateDTO dto) {
        Survey s = mapper.createDTOtoSurvey(dto);

        System.out.println(s.toString());
        Survey sCreated = repository.save(s);
        System.out.println(sCreated.getOwner().getId());
        sCreated.setOwner(ownerService.getEntityByID(sCreated.getOwner().getId()));

//        System.out.println(mapper.surveyToResponseDTO(sCreated).getDescription() + mapper.surveyToResponseDTO(sCreated).getOwner().getName());
        return mapper.surveyToResponseAfterCreateDTO(sCreated);
//        return null;

    }

    public List<SurveyResponseDTO> getAll() {
        List<Survey> surveys = repository.findAll();
        List<SurveyResponseDTO> surveyResponseDTOS = surveys.stream().map(survey -> mapper.surveyToResponseDTO(survey)).toList();
//        surveyResponseDTOS.stream().map();

        return null;
    }

    public SurveyResponseDTO getOne(Long id) {

        Survey s = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("survey", id));
        SurveyResponseDTO surveyResponseDTO = mapper.surveyToResponseDTO(s);
        List<EditionEmbdedDTO> editionEmbdedDTOS = s.getSurveyEditions().stream().map(edition -> editionMapper.editionToEmbdedDto(edition)).toList();
        surveyResponseDTO.setEditions(editionEmbdedDTOS);
        return surveyResponseDTO;
    }

    public void deleteSurvey(Long id) {


    }
}
