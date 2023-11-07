package by.dorogokupets.cvservice.dto;

import by.dorogokupets.cvservice.model.Direction;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestDto {
  private long testId;
  private String title;
  private String description;
  private Long direction;
}
