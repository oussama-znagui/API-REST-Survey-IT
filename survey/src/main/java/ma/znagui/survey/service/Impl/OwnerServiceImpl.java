package ma.znagui.survey.service.Impl;

import ma.znagui.survey.dto.owner.OwnerCreatDTO;
import ma.znagui.survey.dto.owner.OwnerResponseDTO;
import ma.znagui.survey.dto.owner.OwnerUpdateDTO;
import ma.znagui.survey.entity.Owner;
import ma.znagui.survey.exeption.ResourceNotFoundException;
import ma.znagui.survey.mapper.OwnerMapper;
import ma.znagui.survey.repository.OwnerRepository;
import ma.znagui.survey.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    OwnerRepository repository;
    @Autowired
    OwnerMapper mapper;

    public OwnerResponseDTO saveOwner(OwnerCreatDTO dto) {
        Owner o = mapper.CreateDTOtoOwner(dto);
        System.out.println(o.getName());
        return mapper.ownerToResponseDTO(repository.save(o));
    }

    public List<OwnerResponseDTO> getAllOwners() {

        List<Owner> owners = repository.findAll();
        return owners.stream().map(owner -> mapper.ownerToResponseDTO(owner)).toList();
    }

    public OwnerResponseDTO getOne(Long id) {
       Owner o =  repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Owner", id));
       return mapper.ownerToResponseDTO(o);
    }

    public OwnerResponseDTO updateOwner(OwnerUpdateDTO dto) {
        return null;
    }

    public void deleteOwner(Long id) {


    }
}
