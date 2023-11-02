package by.dorogokupets.cvservice.service.impl;

import by.dorogokupets.cvservice.dto.CandidateDto;
import by.dorogokupets.cvservice.model.Candidate;
import by.dorogokupets.cvservice.service.CandidateService;
import by.dorogokupets.cvservice.repository.CandidateRepository;
import jakarta.transaction.Transactional;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {
  private CandidateRepository candidateRepository;
//  private PasswordEncoder passwordEncoder;


//  public CandidateServiceImpl(CandidateRepository candidateRepository, PasswordEncoder passwordEncoder) {
//    this.candidateRepository = candidateRepository;
//    this.passwordEncoder = passwordEncoder;
//  }

  @Override
  public List<Candidate> findAll() {
    return candidateRepository.findAll();
  }

  @Transactional
  @Override
  public void update(CandidateDto candidateDto) {
    Candidate candidate = candidateRepository.findById(candidateDto.getCandidateId())
            .orElseThrow(() -> new ServiceException("Candidate not found"));
    candidate.setFirstName(candidateDto.getFirstName());
    candidate.setLastName(candidateDto.getLastName());
    candidate.setPatronymic(candidateDto.getLastName());
    candidate.setPhoto(candidateDto.getPhoto());
    candidate.setDescription(candidateDto.getDescription());
    candidate.setDirection(candidateDto.getDirection());
    candidate.setCvFile(candidateDto.getCvFile());
    candidateRepository.saveAndFlush(candidate);
  }

  @Override
  public void save(Candidate candidate) {

  }

  @Override
  public void delete(Candidate candidate) {

  }

//  @Override
//  public User createNewUser(User user) {
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
//    return repository.save(user);
//  }

//  @Override
//  public Candidate findByUserName(String firstName) {
//    Candidate candidate = candidateRepository.findByCandidateFirstName(firstName);
//
//    if (candidate == null)
//      throw new UserNotFoundException(firstName);
//    else
//      return candidate;
//  }


}
