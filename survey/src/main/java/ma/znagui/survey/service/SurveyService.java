package ma.znagui.survey.service;

import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseAfterCreateAndUpdateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.dto.survey.SurveyUpdateDto;
import ma.znagui.survey.entity.Survey;

import java.util.List;

public interface SurveyService {
    SurveyResponseAfterCreateAndUpdateDTO saveSurvey(SurveyCreateDTO dto);
    List<SurveyResponseDTO> getAll();
    SurveyResponseDTO getOne(Long id);
    SurveyResponseAfterCreateAndUpdateDTO updateSurvey(SurveyUpdateDto dto, Long id);
    void deleteSurvey(Long id);
    Survey getSurveyEntityByID(Long id);
}
