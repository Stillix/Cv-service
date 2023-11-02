package by.dorogokupets.cvservice.service;

import by.dorogokupets.cvservice.model.TestResult;

import java.util.List;

public interface TestResultService {
  List<TestResult> findAll();
  void update(TestResult testResult);
  void save(TestResult testResult);
}
