package by.dorogokupets.cvservice.service;

import by.dorogokupets.cvservice.model.Direction;
import by.dorogokupets.cvservice.dto.DirectionDto;

import java.util.List;

public interface DirectionService {
  List<Direction> findAll();
  void update(DirectionDto directionDto);
  void save(DirectionDto directionDto);

  DirectionDto findDirectionDtoById(Long id);

  Direction createDirection(DirectionDto directionDto);
}
