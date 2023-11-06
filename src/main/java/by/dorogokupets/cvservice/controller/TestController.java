package by.dorogokupets.cvservice.controller;

import by.dorogokupets.cvservice.dto.DirectionDto;
import by.dorogokupets.cvservice.dto.TestDto;
import by.dorogokupets.cvservice.model.Direction;
import by.dorogokupets.cvservice.model.Test;
import by.dorogokupets.cvservice.service.DirectionService;
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
public class TestController {
  private final TestService testService;

  @Autowired
  public TestController(TestService testService) {
    this.testService = testService;
  }

  @GetMapping("/cv-service/tests")
  public String showTestList(Model model) {
    List<Test> testList = testService.findAll();
    model.addAttribute("testList", testList);
    return "tests";
  }

  @GetMapping("/cv-service/test/edit/{id}")
  public String showEditForm(@PathVariable("id") Long testId, Model model) {
    TestDto testDto = testService.findTestDtoById(testId);
    model.addAttribute("testDto", testDto);
    return "edit-test";
  }
  @PostMapping("/cv-service/test/update")
  public String updateTest(@ModelAttribute TestDto testDto) {
    testService.update(testDto);
    return "redirect:/cv-service/tests";
  }
}
