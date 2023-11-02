package by.dorogokupets.cvservice.repository;

import by.dorogokupets.cvservice.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

//  Test findTestByTitle(String title);

  Optional<Test> findById(Long testId);

//  Test findFirstByFirstName(String firstName);
}
