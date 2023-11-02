package by.dorogokupets.cvservice.service;

import by.dorogokupets.cvservice.dto.CandidateDto;
import by.dorogokupets.cvservice.model.Candidate;

import java.util.List;

public interface CandidateService {
  List<Candidate> findAll();
  void update(CandidateDto candidateDto);
  void save(Candidate candidate);
  void delete(Candidate candidate);
}
