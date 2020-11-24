package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Record {
  private final String artist;
  private final String title;
  private final int year;

  public Record(
      @JsonProperty("artist") String artist,
      @JsonProperty("title") String title,
      @JsonProperty("year") int year) {
    this.artist = artist;
    this.title = title;
    this.year = year;
  }

  public String getArtist() {
    return artist;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }
}
