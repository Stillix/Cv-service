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
@Table(name ="directions")
public class Direction {
  @Id
  private long directionId;
  private String name;
  private String description;

}
