package com.example.repository;

import com.example.model.Record;
import java.util.List;

public interface RecordDao {
  int insertRecord(Record record);

  List<Record> getAllRecords();
}
