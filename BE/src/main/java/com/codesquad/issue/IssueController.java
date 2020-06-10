package com.codesquad.issue;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("issue")
public class IssueController {

  @GetMapping
  public List<IssueResponse> findAllIssue() {
    LocalDateTime now = LocalDateTime.now();
    IssueResponse i1 = IssueResponse.builder()
        .title("[BE] 개발환경 생성 및 설정")
        .createdBy("102092")
        .labels(Arrays.asList("be"))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList("102092", "Sunny"))
        .commentCount(2)
        .build();

    IssueResponse i2 = IssueResponse.builder()
        .title("[FE] 개발 환경 구축")
        .createdBy("baekCode")
        .labels(Arrays.asList("fe"))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList("baekCode", "dev-angelo"))
        .commentCount(0)
        .build();

    IssueResponse i3 = IssueResponse.builder()
        .title("[BE] 개념적, 논리적 DB 설계")
        .createdBy("102092")
        .labels(Arrays.asList("be"))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList("102092", "Sunny"))
        .commentCount(30)
        .build();

    IssueResponse i4 = IssueResponse.builder()
        .title("[BE] Mock API 생성 및 문서 공유")
        .createdBy("102092")
        .labels(Arrays.asList("be", "bug", "documentation", "fe"))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList("102092"))
        .commentCount(0)
        .build();

    return Arrays.asList(i1, i2, i3, i4);
  }
}
