package com.example.service;

import com.example.repository.RecordDao;
import com.example.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

  private final RecordDao recordDao;

  @Autowired
  public RecordService(@Qualifier("fakeDao") RecordDao recordDao) {
    this.recordDao = recordDao;
  }

  public int insertRecord(Record record) {
    return recordDao.insertRecord(record);
  }

  public List<Record> getAllRecords() {
    return recordDao.getAllRecords();
  }
}
