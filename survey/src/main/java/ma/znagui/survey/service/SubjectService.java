package ma.znagui.survey.service;

import ma.znagui.survey.dto.subject.SubjectAfterCreateResponseDTO;
import ma.znagui.survey.dto.subject.SubjectCreateDTO;

public interface SubjectService {
    public SubjectAfterCreateResponseDTO create(SubjectCreateDTO dto);

}
