package ma.znagui.survey.service;

import ma.znagui.survey.dto.owner.OwnerCreatDTO;
import ma.znagui.survey.dto.owner.OwnerResponseDTO;
import ma.znagui.survey.dto.owner.OwnerUpdateDTO;
import ma.znagui.survey.entity.Owner;

import java.util.List;

public interface OwnerService {
    OwnerResponseDTO saveOwner(OwnerCreatDTO dto);
    List<OwnerResponseDTO> getAllOwners();
    OwnerResponseDTO getOne(Long id);
    OwnerResponseDTO updateOwner(OwnerUpdateDTO dto);
    void deleteOwner(Long id);

}
