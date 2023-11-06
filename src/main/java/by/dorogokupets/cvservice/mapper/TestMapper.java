package by.dorogokupets.cvservice.mapper;

import by.dorogokupets.cvservice.dto.TestDto;
import by.dorogokupets.cvservice.model.Test;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Controller;

@Mapper
@Controller
public interface TestMapper {

  TestDto mapToTestDTO(Test test);

  Test mapToTest(TestDto testDto);
}
