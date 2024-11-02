package ma.znagui.survey.mapper;

import ma.znagui.survey.dto.owner.OwnerCreatDTO;
import ma.znagui.survey.dto.owner.OwnerResponseDTO;
import ma.znagui.survey.entity.Owner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OwnerMapper {

    Owner CreateDTOtoOwner(OwnerCreatDTO dto);
    OwnerResponseDTO ownerToResponseDTO(Owner owner);

}
