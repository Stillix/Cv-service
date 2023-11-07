package by.dorogokupets.cvservice.service;

import by.dorogokupets.cvservice.model.Candidate;
import by.dorogokupets.cvservice.model.FileDB;

public interface FilesService {

  FileDB getFile(Long fileId);

  FileDB findByCandidateAndContentType(Candidate candidate, String contentType);
}
