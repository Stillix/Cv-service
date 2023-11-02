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
@Table(name = "directions")
public class Direction {
  @Id
  @Column(name = "id_direction")
  private long directionId;
  @Column(name = "name")
  private String name;
  @Column(name = "description")
  private String description;

}
