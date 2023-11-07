package by.dorogokupets.cvservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "candidates")
public class Candidate {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "candidate_sequence")
  @SequenceGenerator(name = "candidate_sequence", sequenceName = "candidate_sequence", allocationSize = 1, initialValue = 1)
  @Column(name = "id_candidate", nullable = false, unique = true)
  private Long candidateId;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "patronymic")
  private String patronymic;
  @Column(name = "description")
  private String description;
  @Column(name = "possible_directions")
  private int possibleDirections;

}
