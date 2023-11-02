package by.dorogokupets.cvservice.service.impl;

import by.dorogokupets.cvservice.dto.DirectionDto;
import by.dorogokupets.cvservice.model.Direction;
import by.dorogokupets.cvservice.service.DirectionService;
import by.dorogokupets.cvservice.repository.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionServiceImpl implements DirectionService {
  private final DirectionRepository directionRepository;

  @Autowired
  public DirectionServiceImpl(DirectionRepository directionRepository) {
    this.directionRepository = directionRepository;
  }

  @Override
  public List<Direction> findAll() {
    return directionRepository.findAll();
  }

  @Override
  public void update(DirectionDto directionDto) {

  }

  @Override
  public void save(DirectionDto directionDto) {

  }
}
