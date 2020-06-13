package com.codesquad.issue;

import static com.codesquad.issue.api.ApiResult.OK;

import com.codesquad.issue.api.ApiResult;
import io.swagger.annotations.Api;
import java.time.LocalDateTime;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("issues")
public class IssueController {

  private static final Logger log = LoggerFactory.getLogger(IssueController.class);

  @GetMapping
  public ApiResult<MainResponse> findAllIssue() {
    LocalDateTime now = LocalDateTime.now();
    IssueResponse i1 = IssueResponse.builder()
        .id(1L)
        .title("[BE] 개발환경 생성 및 설정")
        .createdBy("102092")
        .labels(Arrays.asList("be"))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList("102092", "Sunny"))
        .commentCount(2)
        .build();

    IssueResponse i2 = IssueResponse.builder()
        .id(2L)
        .title("[FE] 개발 환경 구축")
        .createdBy("baekCode")
        .labels(Arrays.asList("fe"))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList("baekCode", "dev-angelo"))
        .commentCount(0)
        .build();

    IssueResponse i3 = IssueResponse.builder()
        .id(3L)
        .title("[BE] 개념적, 논리적 DB 설계")
        .createdBy("102092")
        .labels(Arrays.asList("be"))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList("102092", "Sunny"))
        .commentCount(30)
        .build();

    IssueResponse i4 = IssueResponse.builder()
        .id(4L)
        .title("[BE] Mock API 생성 및 문서 공유")
        .createdBy("102092")
        .labels(Arrays.asList("be", "bug", "documentation", "fe"))
        .mileStone("1주차")
        .createdTimeAt(now)
        .assignee(Arrays.asList("102092"))
        .commentCount(0)
        .build();

    Author a1 = Author.builder().id("102092").nickName("han").build();
    Author a2 = Author.builder().id("kses1010").nickName("Sosah92").build();
    Author a3 = Author.builder().id("baekCode").nickName("baekCode").build();
    Author a4 = Author.builder().id("dev-angelo").nickName("Angelo").build();

    MileStone m1 = new MileStone("1주차");
    MileStone m2 = new MileStone("2주차");
    MileStone m3 = new MileStone("3주차");

    Label l1 = Label.builder().name("question").description("Further information is requested")
        .color("#d876e3").build();
    Label l2 = Label.builder().name("invalid").description("This doesn't seem right")
        .color("#e4e669").build();
    Label l3 = Label.builder().name("help wanted").description("Extra attention is needed")
        .color("#008672").build();
    Label l4 = Label.builder().name("be").color("#15b510").build();
    Label l5 = Label.builder().name("fe").color("#f2b5f1").build();
    Label l6 = Label.builder().name("bug").description("Something isn't working").color("#d73a4a")
        .build();
    Label l7 = Label.builder().name("documentation")
        .description("Improvements or additions to documentation").color("#0075ca").build();

    return OK(MainResponse.builder()
        .author(Arrays.asList(a1, a2, a3, a4))
        .label(Arrays.asList(l6, l7, l1, l2, l3, l4, l5))
        .mileStones(Arrays.asList(m1, m2, m3))
        .assignee(Arrays.asList(a1, a2, a3, a4))
        .issueResponses(Arrays.asList(i1, i2, i3, i4))
        .build());
  }

  @PostMapping
  public ApiResult<IssueResponse> createIssue(@RequestBody IssueRequest request) {
    log.debug("request : {}", request);
    return OK(IssueResponse.builder()
        .id(1L)
        .title(request.getTitle())
        .body(request.getBody())
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
}
