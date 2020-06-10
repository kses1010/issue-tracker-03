package com.codesquad.issue;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Label {

  private String name;
  private String description;
  private String color;

  @Builder

  public Label(String name, String description, String color) {
    this.name = name;
    this.description = description;
    this.color = color;
  }
}
