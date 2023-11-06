package by.dorogokupets.cvservice.model;

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
@Table(name ="tests")
public class Test {
  @Id
  @Column(name = "id_test")
  private long testId;
  @Column(name = "title")
  private String title;
  @Column(name = "description")
  private String description;
  @Column(name = "direction_id")
  private int direction;
}
