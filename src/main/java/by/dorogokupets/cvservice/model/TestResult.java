package by.dorogokupets.cvservice.model;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.Entity;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "candidate_test_results")
public class TestResult {
  @Id
  private Long testResultId;
  private int candidateId;
  private int testId;
  private LocalDateTime date;
  private int mark;


}
