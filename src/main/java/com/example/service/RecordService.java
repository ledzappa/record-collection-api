package com.example.service;

import com.example.model.Test;
import com.example.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

  @Autowired RecordRepository recordRepository;

  public Test insertRecord(Test record) {
    return recordRepository.save(record);
  }

  public List<Test> getAllRecords() {
    return recordRepository.findAll();
  }
}
