package by.dorogokupets.cvservice.service.impl;

import by.dorogokupets.cvservice.dto.TestDto;
import by.dorogokupets.cvservice.mapper.TestMapper;
import by.dorogokupets.cvservice.model.Test;
import by.dorogokupets.cvservice.service.TestService;
import by.dorogokupets.cvservice.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {
  private final TestRepository testRepository;
  private final TestMapper testMapper;

  @Autowired
  public TestServiceImpl(TestRepository testRepository, TestMapper testMapper) {
    this.testRepository = testRepository;
    this.testMapper = testMapper;
  }

  @Override
  public List<Test> findAll() {
    return testRepository.findAll();
  }

  @Override
  public TestDto findTestDtoById(Long id) {
    Optional<Test> test = testRepository.findById(id);
    return test.map(testMapper::mapToTestDTO).orElse(null);
  }

  @Override
  public void update(TestDto testDto) {
    Test test = testMapper.mapToTest(testDto);
    testRepository.save(test);
  }

  @Override
  public void save(TestDto TestDto) {

  }
}
