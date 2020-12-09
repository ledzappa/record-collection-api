package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  public Test(@JsonProperty("id") int id, @JsonProperty("recordname") String recordname) {
    this.id = id;
    this.recordname = recordname;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setRecordname(String recordname) {
    this.recordname = recordname;
  }

  public int getId() {
    return id;
  }

  public String getRecordname() {
    return recordname;
  }
}
