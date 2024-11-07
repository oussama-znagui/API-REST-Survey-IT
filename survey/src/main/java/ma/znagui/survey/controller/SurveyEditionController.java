package ma.znagui.survey.controller;

import jakarta.validation.Valid;
import ma.znagui.survey.dto.edition.EditionAfterCreateResponseDto;
import ma.znagui.survey.dto.edition.EditionCreateDTO;
import ma.znagui.survey.dto.edition.EditionResponseDTO;
import ma.znagui.survey.entity.SurveyEdition;
import ma.znagui.survey.service.SurveyEditionService;
import ma.znagui.survey.validator.api.CheckExisting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editions")
public class SurveyEditionController {

    @Autowired
    SurveyEditionService service;

//    @GetMapping(value = "/{id}")
//    public R

    @PostMapping
    public ResponseEntity<EditionAfterCreateResponseDto> create(@Valid @RequestBody EditionCreateDTO dto){
        return ResponseEntity.ok(service.createEdition(dto));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EditionResponseDTO> getOne(@CheckExisting(entityC = SurveyEdition.class) @PathVariable("id") Long id){
        return ResponseEntity.ok(service.getEdition(id));
    }

    @GetMapping
    public ResponseEntity<List<EditionResponseDTO>> getAll(){
        return ResponseEntity.ok(service.getAllEditions());
    }


}
