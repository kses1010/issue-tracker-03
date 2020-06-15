package com.codesquad.issue;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Author {

  private String id;
  private String nickName;
  private String avatarUrl;

  @Builder
  public Author(String id, String nickName, String avatarUrl) {
    this.id = id;
    this.nickName = nickName;
    this.avatarUrl = avatarUrl;
  }
}
