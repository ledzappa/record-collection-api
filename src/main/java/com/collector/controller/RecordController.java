package com.collector.controller;

import com.collector.model.Test;
import com.collector.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/record")
@RestController
public class RecordController {

  @Autowired RecordRepository recordRepository;

  @PostMapping
  public Test insertRecord(@RequestBody Test test) {
    return recordRepository.save(test);
  }

  @GetMapping
  public List<Test> getAll() {
    return recordRepository.findAll();
  }
}
