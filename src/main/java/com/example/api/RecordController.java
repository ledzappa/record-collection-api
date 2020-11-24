package com.example.api;

import com.example.model.Record;
import com.example.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/record")
@RestController
public class RecordController {
  private final RecordService recordService;

  @Autowired
  public RecordController(RecordService recordService) {
    this.recordService = recordService;
  }

  @PostMapping
  public void insertRecord(@RequestBody Record record) {
    recordService.insertRecord(record);
  }

  @GetMapping
  public List<Record> getRecords() {
    return recordService.getAllRecords();
  }
}
