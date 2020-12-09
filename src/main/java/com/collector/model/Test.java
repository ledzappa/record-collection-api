package com.collector.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;

  @Column(name = "recordname")
  private String recordname;

  public Test() {}

  public int getId() {
    return id;
  }

  public String getRecordname() {
    return recordname;
  }
}
