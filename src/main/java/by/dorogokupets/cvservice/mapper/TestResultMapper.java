package by.dorogokupets.cvservice.mapper;

import by.dorogokupets.cvservice.dto.DirectionDto;
import by.dorogokupets.cvservice.dto.TestResultDto;
import by.dorogokupets.cvservice.model.Direction;
import by.dorogokupets.cvservice.model.TestResult;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Controller;

@Mapper
@Controller
public interface TestResultMapper {
  TestResultDto mapToTestResultDTO(TestResult testResult);

  TestResult mapToTestResult(TestResultDto testResultDto);
}
