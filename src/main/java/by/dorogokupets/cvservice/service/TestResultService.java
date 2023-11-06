package by.dorogokupets.cvservice.service;

import by.dorogokupets.cvservice.dto.TestResultDto;
import by.dorogokupets.cvservice.model.TestResult;

import java.util.List;

public interface TestResultService {
  List<TestResult> findAll();

  TestResultDto findTestResultDtoById(Long id);

  void update(TestResultDto testResultDto);

  void save(TestResult testResult);
}
