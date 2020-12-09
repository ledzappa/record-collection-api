package com.collector.service;

import com.collector.model.Test;
import com.collector.repository.RecordRepository;
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
