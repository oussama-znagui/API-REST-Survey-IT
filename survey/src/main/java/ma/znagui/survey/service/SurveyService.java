package ma.znagui.survey.service;

import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseAfterCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;

import java.util.List;

public interface SurveyService {
    SurveyResponseAfterCreateDTO saveSurvey(SurveyCreateDTO dto);
    List<SurveyResponseDTO> getAll();
    SurveyResponseDTO getOne(Long id);
//    SurveyResponseDTO updateSurvey( dto);
    void deleteSurvey(Long id);
}
