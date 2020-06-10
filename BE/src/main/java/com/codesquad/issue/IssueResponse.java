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
  private String createdBy;
  private List<String> labels;
  private String mileStone;
  private LocalDateTime createdTimeAt;
  private List<String> assignee;
  private int commentCount;

  @Builder
  public IssueResponse(Long id, String title, String createdBy,
      List<String> labels, String mileStone, LocalDateTime createdTimeAt,
      List<String> assignee, int commentCount) {
    this.id = id;
    this.title = title;
    this.createdBy = createdBy;
    this.labels = labels;
    this.mileStone = mileStone;
    this.createdTimeAt = createdTimeAt;
    this.assignee = assignee;
    this.commentCount = commentCount;
  }
}
