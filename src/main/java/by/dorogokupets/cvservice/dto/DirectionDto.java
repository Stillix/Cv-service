package by.dorogokupets.cvservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DirectionDto {

  private long directionId;
  private String name;
  private String description;

}
