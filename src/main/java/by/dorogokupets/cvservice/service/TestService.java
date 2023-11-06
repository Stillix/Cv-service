package by.dorogokupets.cvservice.service;


import by.dorogokupets.cvservice.model.Test;
import by.dorogokupets.cvservice.dto.TestDto;

import java.util.List;

public interface TestService {
  List<Test> findAll();

  TestDto findTestDtoById(Long id);

  void update(TestDto testDto);

  void save(TestDto TestDto);
}
