package by.dorogokupets.cvservice.controller;

import by.dorogokupets.cvservice.model.Direction;
import by.dorogokupets.cvservice.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DirectionController {
  private final DirectionService directionService;

  @Autowired
  public DirectionController(DirectionService directionService) {
    this.directionService = directionService;
  }

  @GetMapping("/cv-service/directions")
  public String showDirectionList(Model model) {
    List<Direction> directionList = directionService.findAll();
    model.addAttribute("directionList", directionList);
    return "home-page";
  }

}
