package by.dorogokupets.cvservice.dto;

import lombok.*;

@Data
@Builder
public class CandidateDto {
  private Long candidateId;
  private String firstName;
  private String lastName;
  private String patronymic;
  private String photo;
  private String description;
  private String cvFile;
  private int direction;
}
