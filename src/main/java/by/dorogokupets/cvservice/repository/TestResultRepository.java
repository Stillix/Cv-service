package by.dorogokupets.cvservice.repository;

import by.dorogokupets.cvservice.model.TestResult;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface TestResultRepository extends JpaRepository<TestResult, Long> {
  Optional<TestResult> findByCandidateId(Long candidateId);
  Optional<TestResult> findByTestId(Long testId);
  Optional<TestResult> findByMark(Long testResultId);
}
