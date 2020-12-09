package com.example.repository;

import com.example.model.Record;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeDao")
public class FakeRecordDataAccessService implements RecordDao {

  private static ArrayList<Record> DB = new ArrayList<>();

  @Override
  public int insertRecord(Record record) {
    DB.add(record);
    return 1;
  }

  @Override
  public List<Record> getAllRecords() {
    return DB;
  }
}
