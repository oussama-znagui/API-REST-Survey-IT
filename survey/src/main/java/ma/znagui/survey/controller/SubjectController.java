package ma.znagui.survey.controller;

import ma.znagui.survey.dto.subject.SubjectAfterCreateResponseDTO;
import ma.znagui.survey.dto.subject.SubjectCreateDTO;
import ma.znagui.survey.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    SubjectService service;

    @PostMapping
    public ResponseEntity<SubjectAfterCreateResponseDTO> create(SubjectCreateDTO dto){
        return ResponseEntity.ok(service.create(dto));
    }
}
