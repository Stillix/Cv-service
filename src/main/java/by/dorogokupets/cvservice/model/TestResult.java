package by.dorogokupets.cvservice.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
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
  @Column(name = "id_test_result")
  private Long testResultId;
  @Column(name = "candidate_id")
  private int candidateId;
  @Column(name = "test_id")
  private int testId;
  @Column(name = "date")
  private LocalDateTime date;
  @Column(name = "mark")
  private int mark;

}
