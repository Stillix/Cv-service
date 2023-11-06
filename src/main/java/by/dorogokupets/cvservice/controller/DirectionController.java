package by.dorogokupets.cvservice.controller;

import by.dorogokupets.cvservice.dto.CandidateDto;
import by.dorogokupets.cvservice.dto.DirectionDto;
import by.dorogokupets.cvservice.model.Direction;
import by.dorogokupets.cvservice.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
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
    return "directions";
  }

  @PostMapping("/cv-service/direction")
  public String createDirection(Model model) {
//    Direction direction= directionService.createDirection();
//    model.addAttribute("direction", direction);
    return "directions";
  }

  @GetMapping("/cv-service/direction/edit/{id}")
  public String showEditForm(@PathVariable("id") Long candidateId, Model model) {
    DirectionDto directionDto = directionService.findDirectionDtoById(candidateId);
    model.addAttribute("directionDto", directionDto);
    return "edit-direction";
  }
  @PostMapping("/cv-service/direction/update")
  public String updateDirection(@ModelAttribute DirectionDto directionDto) {
    directionService.update(directionDto);
    return "redirect:/cv-service/directions";
  }
}
