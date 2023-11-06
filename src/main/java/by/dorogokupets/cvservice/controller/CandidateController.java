package by.dorogokupets.cvservice.controller;

import by.dorogokupets.cvservice.dto.CandidateDto;
import by.dorogokupets.cvservice.exception.ServiceException;
import by.dorogokupets.cvservice.model.Candidate;
import by.dorogokupets.cvservice.service.CandidateService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CandidateController {
  public static final String MESSAGE = "message";
  private final CandidateService candidateService;

  @Autowired
  public CandidateController(CandidateService candidateService) {
    this.candidateService = candidateService;
  }

  @GetMapping("/cv-service/candidates")
  public String showCandidates(Model model) {
    List<CandidateDto> candidateDTOList = candidateService.findAll();
    model.addAttribute("candidateDTOList", candidateDTOList);
    return "candidates";
  }

  @GetMapping("cv-service/candidate/delete/{id}")
  public String deleteCandidate(@PathVariable("id") Long candidateId, RedirectAttributes redirectAttributes) {
    candidateService.delete(candidateId);
    redirectAttributes.addFlashAttribute(MESSAGE, "Candidate (id=" + candidateId + ") has been successfully deleted");
    return "redirect:/client/notices";
  }

//  @GetMapping("/cv-service/candidate/create-candidate")
//  public String showCreateForm(Model model) {
//    model.addAttribute("notice", new Candidate());
//    return "candidate-form";
//  }
  @GetMapping("/cv-service/candidate/edit/{id}")
  public String showEditForm(@PathVariable("id") Long candidateId, Model model) {
    CandidateDto candidateDTO = candidateService.findCandidateDtoById(candidateId);
    model.addAttribute("candidateDTO", candidateDTO);
    return "edit-candidate";
  }
  @PostMapping("/cv-service/candidates/update")
  public String updateCandidate(@ModelAttribute CandidateDto candidateDTO) {
    candidateService.update(candidateDTO);
    return "redirect:/cv-service/candidates";
  }

}
