package by.dorogokupets.cvservice.service.impl;

import by.dorogokupets.cvservice.dto.TestResultDto;
import by.dorogokupets.cvservice.mapper.TestResultMapper;
import by.dorogokupets.cvservice.model.TestResult;
import by.dorogokupets.cvservice.service.TestResultService;
import by.dorogokupets.cvservice.repository.TestResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestResultServiceImpl implements TestResultService {
  private final TestResultRepository testResultRepository;
  private final TestResultMapper testResultMapper;

  public TestResultServiceImpl(TestResultRepository testResultRepository, TestResultMapper testResultMapper) {
    this.testResultRepository = testResultRepository;
    this.testResultMapper = testResultMapper;
  }


  @Override
  public List<TestResult> findAll() {
    return testResultRepository.findAll();
  }

  @Override
  public TestResultDto findTestResultDtoById(Long id) {
    Optional<TestResult> testResult = testResultRepository.findById(id);
    return testResult.map(testResultMapper::mapToTestResultDTO).orElse(null);
  }

  @Override
  public void update(TestResultDto testResultDto) {
    TestResult testResult = testResultMapper.mapToTestResult(testResultDto);
    testResultRepository.save(testResult);
  }

  @Override
  public void save(TestResult testResult) {

  }
}
