package com.codesquad.issue.controller;

import static com.codesquad.issue.api.ApiResult.OK;

import com.codesquad.issue.Label;
import com.codesquad.issue.api.ApiResult;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("labels")
public class LabelController {

  @GetMapping
  public ApiResult<List<Label>> findAll() {
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
    return OK(Arrays.asList(l1, l2, l3, l4, l5, l6, l7));
  }
}
