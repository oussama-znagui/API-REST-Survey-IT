package ma.znagui.survey.service.Impl;

import ma.znagui.survey.dto.subject.SubjectAfterCreateResponseDTO;
import ma.znagui.survey.dto.subject.SubjectCreateDTO;
import ma.znagui.survey.entity.Subject;
import ma.znagui.survey.mapper.SubjectMapper;
import ma.znagui.survey.repository.SubjectRepository;
import ma.znagui.survey.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectRepository repository;
    @Autowired
    SubjectMapper mapper;



    public SubjectAfterCreateResponseDTO create(SubjectCreateDTO dto) {
        Subject subject = mapper.createDTOtoSubject(dto);
        Subject created = repository.save(subject);
        return  mapper.subjectToAfterCreateDTO(created);
    }
}
