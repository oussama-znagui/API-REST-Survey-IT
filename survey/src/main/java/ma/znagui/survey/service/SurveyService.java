package ma.znagui.survey.service;

import ma.znagui.survey.dto.owner.OwnerCreatDTO;
import ma.znagui.survey.dto.owner.OwnerResponseDTO;
import ma.znagui.survey.dto.owner.OwnerUpdateDTO;
import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;

import java.util.List;

public interface SurveyService {
    SurveyResponseDTO saveSurvey(SurveyCreateDTO dto);
    List<SurveyResponseDTO> getAll();
    SurveyResponseDTO getOne(Long id);
//    SurveyResponseDTO updateSurvey( dto);
    void deleteSurvey(Long id);
}
