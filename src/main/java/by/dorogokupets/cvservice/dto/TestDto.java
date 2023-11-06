package by.dorogokupets.cvservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestDto {
  private long testId;
  private String title;
  private String description;
  private int direction;
}
