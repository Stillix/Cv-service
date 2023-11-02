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
@Table(name ="candidates")
public class Candidate {

  @Id
  private Long candidateId;
  private String firstName;
  private String lastName;
  private String patronymic;
  private String photo;
  private String description;
  private String cvFile;
  private int direction;

}
