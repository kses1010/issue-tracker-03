package com.codesquad.issue.controller;

import static com.codesquad.issue.api.ApiResult.OK;
import static java.time.LocalDateTime.now;

import com.codesquad.issue.Author;
import com.codesquad.issue.IssueDetail;
import com.codesquad.issue.IssueRequest;
import com.codesquad.issue.IssueResponse;
import com.codesquad.issue.Label;
import com.codesquad.issue.api.ApiResult;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("issues")
public class IssueController {

  @GetMapping
  public ApiResult<List<IssueResponse>> findAllIssue() {
    LocalDateTime now = now();
    IssueResponse i1 = IssueResponse.builder()
        .id(1L)
        .title("[BE] 개발환경 생성 및 설정")
        .author(Author.builder()
            .userId("102092")
            .name("han")
            .avatarURL("https://avatars1.githubusercontent.com/u/22140570?s=40&v=4")
            .build()
        )
        .labels(Arrays.asList(Label.builder().name("be").color("#15b510").build()))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList(
            Author.builder()
                .userId("102092")
                .name("han")
                .avatarURL(
                    "https://avatars1.githubusercontent.com/u/22140570?s=40&v=4")
                .build(),
            Author.builder()
                .userId("kses1010")
                .name("Sosah92")
                .avatarURL(
                    "https://avatars3.githubusercontent.com/u/49144662?s=40&v=4")
                .build()
        ))
        .commentCount(2)
        .build();

    IssueResponse i2 = IssueResponse.builder()
        .id(2L)
        .title("[FE] 개발 환경 구축")
        .author(Author.builder()
            .userId("baekCode")
            .name("baekCode")
            .avatarURL(
                "https://avatars1.githubusercontent.com/u/44539224?s=40&v=4")
            .build()
        )
        .labels(Arrays.asList(Label.builder().name("fe").color("#f2b5f1").build()))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList(Author.builder()
                .userId("baekCode")
                .name("baekCode")
                .avatarURL("https://avatars1.githubusercontent.com/u/44539224?s=40&v=4")
                .build(),
            Author.builder()
                .userId("dev-angelo")
                .name("Angelo")
                .avatarURL("https://avatars2.githubusercontent.com/u/58318174?s=40&v=4")
                .build()
        ))
        .commentCount(0)
        .build();

    IssueResponse i3 = IssueResponse.builder()
        .id(3L)
        .title("[BE] 개념적, 논리적 DB 설계")
        .author(Author.builder()
            .userId("102092")
            .name("han")
            .avatarURL(
                "https://avatars1.githubusercontent.com/u/22140570?s=40&v=4")
            .build()
        )
        .labels(Arrays.asList(Label.builder().name("be").color("#15b510").build()))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList(
            Author.builder()
                .userId("102092")
                .name("han")
                .avatarURL(
                    "https://avatars1.githubusercontent.com/u/22140570?s=40&v=4")
                .build(),
            Author.builder()
                .userId("kses1010")
                .name("Sosah92")
                .avatarURL(
                    "https://avatars3.githubusercontent.com/u/49144662?s=40&v=4")
                .build()
        ))
        .commentCount(30)
        .build();

    IssueResponse i4 = IssueResponse.builder()
        .id(4L)
        .title("[BE] Mock API 생성 및 문서 공유")
        .author(Author.builder()
            .userId("102092")
            .name("han")
            .avatarURL(
                "https://avatars1.githubusercontent.com/u/22140570?s=40&v=4")
            .build()
        )
        .labels(Arrays.asList(Label.builder().name("be").color("#15b510").build()))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList(
            Author.builder()
                .userId("102092")
                .name("han")
                .avatarURL(
                    "https://avatars1.githubusercontent.com/u/22140570?s=40&v=4")
                .build()))
        .commentCount(0)
        .build();

    return OK(Arrays.asList(i1, i2, i3, i4));
  }

  @PostMapping
  public ApiResult<IssueResponse> createIssue(@RequestBody IssueRequest request) {
    log.debug("request : {}", request);
    return OK(IssueResponse.builder()
        .id(1L)
        .title(request.getTitle())
        .body(request.getContents())
        .build());
  }

  @PutMapping("{id}")
  public ApiResult<IssueResponse> modifyIssue(
      @PathVariable(name = "id") Long issueId,
      @RequestBody IssueRequest request) {
    log.debug("issueId : {}", issueId);
    log.debug("request : {}", request);
    return OK(IssueResponse.builder().build());
  }

  @DeleteMapping("{id}")
  public ApiResult<Boolean> deleteIssue(@PathVariable(name = "id") Long issueId) {
    log.debug("issueId : {}", issueId);
    return OK(true);
  }

  @GetMapping("{id}")
  public ResponseEntity<IssueDetail> detailIssue(@PathVariable(name = "id") Long issueId) {
    Long i1 = 1L;
    Long i2 = 2L;
    Long i3 = 3L;

    if (issueId.equals(i1)) {
      IssueDetail detail = IssueDetail.builder()
          .id(1L)
          .title("[BE] 개발환경 생성 및 설정")
          .contents("### 개발환경을 만들어주세요" + "\n"
              + "- 개발환경이 어떤게 있을까?" + "\n"
              + "**bold** 해볼까요?" + "\n"
          )
          .createdAt(now())
          .author(Author.builder()
              .userId("102092")
              .name("han")
              .avatarURL(
                  "https://avatars1.githubusercontent.com/u/22140570?s=40&v=4")
              .build()
          )
          .build();
      return ResponseEntity.ok(detail);
    }

    if (issueId.equals(i2)) {
      IssueDetail detail = IssueDetail.builder()
          .id(2L)
          .title("[FE] 개발 환경 구축")
          .createdAt(now())
          .author(Author.builder()
              .userId("baekCode")
              .name("baekCode")
              .avatarURL(
                  "https://avatars1.githubusercontent.com/u/44539224?s=40&v=4")
              .build()
          )
          .build();
      return ResponseEntity.ok(detail);
    }

    if (issueId.equals(i3)) {
      IssueDetail detail = IssueDetail.builder()
          .id(3L)
          .title("[Team] API문서 공유")
          .contents("### 문서공유" + "\n"
              + "[URL 추가](https://github.com/codesquad-member-2020/issue-tracker-03/issues/21)"
              + "\n"
          )
          .createdAt(now())
          .author(Author.builder()
              .userId("kses1010")
              .name("sunny")
              .avatarURL(
                  "https://avatars3.githubusercontent.com/u/49144662?s=40&v=4")
              .build()
          )
          .build();
      return ResponseEntity.ok(detail);
    }
    return ResponseEntity.ok(null);
  }
}
