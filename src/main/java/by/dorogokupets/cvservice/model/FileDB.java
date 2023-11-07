package by.dorogokupets.cvservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;

import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "files")
public class FileDB {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
 /* @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "file_sequence")
  @SequenceGenerator(name = "file_sequence", sequenceName = "file_sequence", allocationSize = 1, initialValue = 1)*/
  @Column(name = "id_file", nullable = false, unique = true)
  private Long id;


  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "candidate_id", nullable = false)
  private Candidate candidate;


  @Column
  private String name;

  @Column
  private String contentType;

  @Column
  private Long size;

  @Lob
  private byte[] data;

}
