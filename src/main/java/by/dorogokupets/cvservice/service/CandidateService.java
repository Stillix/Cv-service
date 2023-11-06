package by.dorogokupets.cvservice.service;

import by.dorogokupets.cvservice.dto.CandidateDto;
import by.dorogokupets.cvservice.exception.ServiceException;
import by.dorogokupets.cvservice.model.Candidate;

import java.util.List;

public interface CandidateService {
  List<CandidateDto> findAll();

  void update(CandidateDto candidateDto);

  void save(Candidate candidate);

  void delete(Long candidateId);
  CandidateDto findCandidateDtoById(Long id);
}
