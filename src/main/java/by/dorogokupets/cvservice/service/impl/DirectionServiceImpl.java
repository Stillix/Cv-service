package by.dorogokupets.cvservice.service.impl;

import by.dorogokupets.cvservice.dto.CandidateDto;
import by.dorogokupets.cvservice.dto.DirectionDto;
import by.dorogokupets.cvservice.mapper.DirectionMapper;
import by.dorogokupets.cvservice.model.Candidate;
import by.dorogokupets.cvservice.model.Direction;
import by.dorogokupets.cvservice.service.DirectionService;
import by.dorogokupets.cvservice.repository.DirectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectionServiceImpl implements DirectionService {
  private final DirectionRepository directionRepository;
  private final DirectionMapper directionMapper;

  public DirectionServiceImpl(DirectionRepository directionRepository, DirectionMapper directionMapper) {
    this.directionRepository = directionRepository;
    this.directionMapper = directionMapper;
  }

  @Override
  public List<Direction> findAll() {
    return directionRepository.findAll();
  }

  @Override
  public void save(DirectionDto directionDto) {

  }
  @Override
  public DirectionDto findDirectionDtoById(Long id) {
    Optional<Direction> direction = directionRepository.findById(id);
    return direction.map(directionMapper::mapToDirectionDTO).orElse(null);
  }
  @Override
  public void update(DirectionDto directionDto) {
    Direction direction = directionMapper.mapToDirection(directionDto);
    directionRepository.save(direction);
  }

  @Override
  public Direction createDirection(DirectionDto directionDto) {
    Direction direction = Direction.builder()
            .name(directionDto.getName())
            .description(directionDto.getDescription())
            .build();
    return directionRepository.save(direction);
  }

}

