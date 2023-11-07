package by.dorogokupets.cvservice.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestResultDto {
  private Long testResultId;
  private int candidateId;
  private int testId;
  private LocalDateTime date;
  private int mark;

}
