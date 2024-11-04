package ma.znagui.survey.controller;

import jakarta.validation.Valid;
import ma.znagui.survey.dto.survey.SurveyCreateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseAfterCreateAndUpdateDTO;
import ma.znagui.survey.dto.survey.SurveyResponseDTO;
import ma.znagui.survey.dto.survey.SurveyUpdateDto;
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
    public ResponseEntity<SurveyResponseAfterCreateAndUpdateDTO> create(@Valid @RequestBody SurveyCreateDTO dto){
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


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@CheckExisting(entityC = Survey.class) @PathVariable("id") Long id){
        surveyService.deleteSurvey(id);
        return ResponseEntity.ok("Survey supprimée avec succes") ;
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<SurveyResponseAfterCreateAndUpdateDTO> update(@CheckExisting(entityC = Survey.class) @PathVariable("id") Long id, @Valid @RequestBody SurveyUpdateDto dto){
       return ResponseEntity.ok(surveyService.updateSurvey(dto,id));
    }
}
