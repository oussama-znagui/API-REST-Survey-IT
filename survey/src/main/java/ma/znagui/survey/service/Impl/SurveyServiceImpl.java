package ma.znagui.survey.service.Impl;

import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.entity.Survey;
import ma.znagui.survey.mapper.SurveyMapper;
import ma.znagui.survey.repository.SurveyRepository;
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

    public SurveyResponseDTO saveSurvey(SurveyCreateDTO dto) {
        Survey s = repository.save(mapper.createDTOtoSurvey(dto));
        return mapper.surveyToResponseDTO(s);

    }

    public List<SurveyResponseDTO> getAll() {
        return List.of();
    }

    public SurveyResponseDTO getOne(Long id) {
        return null;
    }

    public void deleteSurvey(Long id) {

    }
}
