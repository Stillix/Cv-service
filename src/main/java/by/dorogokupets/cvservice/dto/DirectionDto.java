package by.dorogokupets.cvservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DirectionDto {

  private Long directionId;
  private String name;
  private String description;

}
