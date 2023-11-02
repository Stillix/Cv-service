package by.dorogokupets.cvservice.model;

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
@Table(name ="tests")
public class Test {
  @Id
  private long testId;
  private String title;
  private String description;
  private String direction;
}
