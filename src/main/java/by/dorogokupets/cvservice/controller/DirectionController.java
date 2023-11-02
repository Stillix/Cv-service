package by.dorogokupets.cvservice.controller;

import by.dorogokupets.cvservice.model.Direction;
import by.dorogokupets.cvservice.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DirectionController {
  private final DirectionService directionService;

  @Autowired
  public DirectionController(DirectionService directionService) {
    this.directionService = directionService;

  }

  @GetMapping("/Cv-service/directions")
  public String showDirectionList(Model model) {
    List<Direction> directionList = directionService.findAll();
    model.addAttribute("directionList", directionList);
    return "directions";
  }

}
