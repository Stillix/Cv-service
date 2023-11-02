package by.dorogokupets.cvservice.repository;

import by.dorogokupets.cvservice.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

  Candidate findCandidatesByLastName(String lastName);

  Optional<Candidate> findById(Long candidateId);

  Optional<Candidate> findFirstByFirstName(String firstName);

}
