package ma.znagui.survey.controller;

import jakarta.validation.Valid;
import ma.znagui.survey.dto.owner.OwnerCreatDTO;
import ma.znagui.survey.dto.owner.OwnerResponseDTO;
import ma.znagui.survey.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    OwnerService ownerService;


    @PostMapping
    public ResponseEntity<OwnerResponseDTO> create(@Valid @RequestBody OwnerCreatDTO dto){
        return ResponseEntity.ok(ownerService.saveOwner(dto));
    }

    @GetMapping
    public ResponseEntity<List<OwnerResponseDTO>> getAll(){
        return ResponseEntity.ok(ownerService.getAllOwners());

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OwnerResponseDTO> getOnne(@PathVariable("id") Long id){
        return ResponseEntity.ok(ownerService.getOne(id));

    }




}
