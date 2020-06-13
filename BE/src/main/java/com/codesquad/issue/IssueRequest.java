package com.codesquad.issue;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IssueRequest {

  private String title;
  private String body;

}
