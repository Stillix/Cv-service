package by.dorogokupets.cvservice.repository;

import by.dorogokupets.cvservice.model.Candidate;
import by.dorogokupets.cvservice.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilesRepository extends JpaRepository<FileDB, Long> {

  FileDB findByCandidateAndContentType(Candidate candidate, String contentType);

  List<FileDB> findByCandidate(Candidate candidate);
}
