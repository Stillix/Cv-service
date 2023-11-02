package by.dorogokupets.cvservice.service.impl;

import by.dorogokupets.cvservice.model.TestResult;
import by.dorogokupets.cvservice.service.TestResultService;
import by.dorogokupets.cvservice.repository.TestResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestResultServiceImpl implements TestResultService {
  private final TestResultRepository testResultRepository;

  public TestResultServiceImpl(TestResultRepository testResultRepository) {
    this.testResultRepository = testResultRepository;
  }


  @Override
  public List<TestResult> findAll() {
    return testResultRepository.findAll();
  }

  @Override
  public void update(TestResult testResult) {

  }

  @Override
  public void save(TestResult testResult) {

  }
}
