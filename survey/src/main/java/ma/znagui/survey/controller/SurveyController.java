package ma.znagui.survey.controller;

import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/survey")
public class SurveyController {
@Autowired
    SurveyService surveyService;


    @PostMapping
    public ResponseEntity<SurveyResponseDTO> create(@RequestBody SurveyCreateDTO dto){
        return ResponseEntity.ok(surveyService.saveSurvey(dto));
    }
}
