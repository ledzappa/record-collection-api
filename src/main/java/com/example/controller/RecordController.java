package com.example.controller;

import com.example.model.Record;
import com.example.model.Test;
import com.example.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/record")
@RestController
public class RecordController {

  @Autowired RecordRepository recordRepository;

  @PostMapping
  public String insertRecord(@RequestBody Test test) {
    recordRepository.save(test);
    return "success";
  }

  @GetMapping
  public List<Test> getAll() {
    return recordRepository.findAll();
  }
}
