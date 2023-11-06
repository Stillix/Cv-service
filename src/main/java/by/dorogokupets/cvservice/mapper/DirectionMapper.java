package by.dorogokupets.cvservice.mapper;

import by.dorogokupets.cvservice.dto.CandidateDto;
import by.dorogokupets.cvservice.dto.DirectionDto;
import by.dorogokupets.cvservice.model.Candidate;
import by.dorogokupets.cvservice.model.Direction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Controller;

@Mapper
@Controller
public interface DirectionMapper {
  DirectionMapper MAPPER = Mappers.getMapper(DirectionMapper.class);

  DirectionDto mapToDirectionDTO(Direction direction);

  Direction mapToDirection(DirectionDto directionDto);
}
