package com.codesquad.issue;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Author {

  private String userId;
  private String name;
  private String avatarURL;

  @Builder
  public Author(String userId, String name, String avatarURL) {
    this.userId = userId;
    this.name = name;
    this.avatarURL = avatarURL;
  }
}
