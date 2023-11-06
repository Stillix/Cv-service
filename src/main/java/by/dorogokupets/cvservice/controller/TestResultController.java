package by.dorogokupets.cvservice.controller;

import by.dorogokupets.cvservice.dto.TestDto;
import by.dorogokupets.cvservice.dto.TestResultDto;
import by.dorogokupets.cvservice.model.Test;
import by.dorogokupets.cvservice.model.TestResult;
import by.dorogokupets.cvservice.service.TestResultService;
import by.dorogokupets.cvservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestResultController {

  private final TestResultService testResultService;

  @Autowired
  public TestResultController(TestResultService testResultService) {
    this.testResultService = testResultService;
  }

  @GetMapping("/cv-service/test-results")
  public String showDirectionList(Model model) {
    List<TestResult> testResultList = testResultService.findAll();
    model.addAttribute("testResultList", testResultList);
    return "test-results";
  }

  @GetMapping("/cv-service/test-result/edit/{id}")
  public String showEditForm(@PathVariable("id") Long testResultId, Model model) {
    TestResultDto testResultDto = testResultService.findTestResultDtoById(testResultId);
    model.addAttribute("testResultDto", testResultDto);
    return "edit-test-result";
  }
  @PostMapping("/cv-service/test-result/update")
  public String updateTest(@ModelAttribute TestResultDto testResultDto) {
    testResultService.update(testResultDto);
    return "redirect:/cv-service/test-results";
  }
}
