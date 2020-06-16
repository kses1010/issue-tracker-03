package com.codesquad.issue;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class IssueResponse {

  private Long id;
  private String title;
  private String contents;
  private Author author;
  private List<Label> labels;
  private String mileStone;
  private LocalDateTime createdTimeAt;
  private List<Author> assignee;
  private int commentCount;

  @Builder
  public IssueResponse(Long id, String title, String contents, Author author,
      List<Label> labels, String mileStone, LocalDateTime createdTimeAt,
      List<Author> assignee, int commentCount) {
    this.id = id;
    this.title = title;
    this.contents = contents;
    this.author = author;
    this.labels = labels;
    this.mileStone = mileStone;
    this.createdTimeAt = createdTimeAt;
    this.assignee = assignee;
    this.commentCount = commentCount;
  }
}
