package by.dorogokupets.cvservice.service.impl;

import by.dorogokupets.cvservice.dto.TestDto;
import by.dorogokupets.cvservice.model.Test;
import by.dorogokupets.cvservice.service.TestService;
import by.dorogokupets.cvservice.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
  private final TestRepository testRepository;

  @Autowired
  public TestServiceImpl(TestRepository testRepository) {
    this.testRepository = testRepository;
  }

  @Override
  public List<Test> findAll() {
    return testRepository.findAll();
  }

  @Override
  public void updateCandidate(TestDto testDto) {

  }

  @Override
  public void save(TestDto TestDto) {

  }
}
