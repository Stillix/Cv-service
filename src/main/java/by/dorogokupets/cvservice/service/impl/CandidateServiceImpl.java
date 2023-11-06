package by.dorogokupets.cvservice.service.impl;

import by.dorogokupets.cvservice.dto.CandidateDto;
import by.dorogokupets.cvservice.mapper.CandidateMapper;
import by.dorogokupets.cvservice.model.Candidate;
import by.dorogokupets.cvservice.service.CandidateService;
import by.dorogokupets.cvservice.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService {
  private final CandidateRepository candidateRepository;
  private final CandidateMapper candidateMapper;

  public CandidateServiceImpl(CandidateRepository candidateRepository, CandidateMapper candidateMapper) {
    this.candidateRepository = candidateRepository;
    this.candidateMapper = candidateMapper;
  }

  @Override
  public List<CandidateDto> findAll() {
    List<Candidate> candidates = candidateRepository.findAll();
    return candidates.stream()
            .map(candidateMapper::mapToCandidateDTO)
            .toList();
  }


  @Override
  public void save(Candidate candidate) {

  }

  @Override
  public void delete(Long candidateId) {
    candidateRepository.deleteById(candidateId);
  }

  @Override
  public CandidateDto findCandidateDtoById(Long id) {
    Optional<Candidate> candidate = candidateRepository.findById(id);
    return candidate.map(candidateMapper::mapToCandidateDTO).orElse(null);
  }

  @Override
  public void update(CandidateDto candidateDTO) {
    Candidate candidate = candidateMapper.mapToCandidate(candidateDTO);
    candidateRepository.save(candidate);
  }
}
