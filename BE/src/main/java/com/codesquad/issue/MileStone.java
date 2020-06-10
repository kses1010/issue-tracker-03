package com.codesquad.issue;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MileStone {

  private String title;

  public MileStone(String title) {
    this.title = title;
  }
}
