package by.dorogokupets.cvservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  public MainController() {

  }

  @GetMapping("/Cv-service")
  public String index(Model model) {
    model.addAttribute("message", "Добро пожаловать на главную страницу!");
    return "home-page";
  }


}
