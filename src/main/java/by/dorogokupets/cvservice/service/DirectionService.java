package by.dorogokupets.cvservice.service;

import by.dorogokupets.cvservice.domain.model.Direction;
import by.dorogokupets.cvservice.domain.dto.DirectionDto;
import org.springframework.data.domain.Page;

public interface DirectionService {
  void update(DirectionDto directionDto);

  Page<Direction> findAll(int pageNo, int pageSize, String sortBy, String sortDirection);

  void save(DirectionDto directionDto);

  DirectionDto findDirectionDtoById(Long id);
}
