package by.dorogokupets.cvservice.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TestResultDto {
  private Long testResultId;
  private int candidateId;
  private int testId;
  private int mark;

}
