package ma.znagui.survey.controller;

import jakarta.validation.Valid;
import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseAfterCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.entity.Survey;
import ma.znagui.survey.service.SurveyService;
import ma.znagui.survey.validator.api.CheckExisting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survey")
public class SurveyController {
@Autowired
    SurveyService surveyService;


    @PostMapping
    public ResponseEntity<SurveyResponseAfterCreateDTO> create(@Valid @RequestBody SurveyCreateDTO dto){
        return ResponseEntity.ok(surveyService.saveSurvey(dto));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<SurveyResponseDTO> getOne(@CheckExisting(entityC = Survey.class) @PathVariable("id") Long id){
        return ResponseEntity.ok(surveyService.getOne(id));
    }

    @GetMapping
    public ResponseEntity<List<SurveyResponseDTO>> getAll(){
        return ResponseEntity.ok(surveyService.getAll());
    }
}
