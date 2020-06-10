package com.codesquad.issue;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MainResponse {

  private List<Author> author;
  private List<Label> label;
  private List<MileStone> mileStones;
  private List<Author> assignee;
  private List<IssueResponse> issueResponses;

  @Builder
  public MainResponse(List<Author> author, List<Label> label,
      List<MileStone> mileStones, List<Author> assignee, List<IssueResponse> issueResponses) {
    this.author = author;
    this.label = label;
    this.mileStones = mileStones;
    this.assignee = assignee;
    this.issueResponses = issueResponses;
  }
}
