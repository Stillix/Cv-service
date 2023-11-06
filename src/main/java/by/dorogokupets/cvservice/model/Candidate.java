package by.dorogokupets.cvservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.Entity;
import org.antlr.v4.runtime.misc.NotNull;

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
  @Column(name = "id_candidate")
  private Long candidateId;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "patronymic")
  private String patronymic;
  @Column(name = "photo")
  private String photo;
  @Column(name = "description")
  private String description;
  @Column(name = "cv_file")
  private String cvFile;
  @Column(name = "possible_directions")
  private int possibleDirections;

}
