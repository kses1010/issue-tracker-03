package com.codesquad.issue.controller;

import static com.codesquad.issue.api.ApiResult.OK;

import com.codesquad.issue.Author;
import com.codesquad.issue.api.ApiResult;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("assignees")
public class AssigneeController {

  @GetMapping
  public ApiResult<List<Author>> findAll() {

    Author a1 = Author.builder()
        .userId("102092")
        .name("han")
        .avatarURL(
            "https://avatars1.githubusercontent.com/u/22140570?s=40&v=4")
        .build();
    Author a2 = Author.builder()
        .userId("kses1010")
        .name("Sosah92")
        .avatarURL(
            "https://avatars3.githubusercontent.com/u/49144662?s=40&v=4")
        .build();
    Author a3 = Author.builder()
        .userId("baekCode")
        .name("baekCode")
        .avatarURL("https://avatars1.githubusercontent.com/u/44539224?s=40&v=4")
        .build();
    Author a4 = Author.builder()
        .userId("dev-angelo")
        .name("Angelo")
        .avatarURL("https://avatars2.githubusercontent.com/u/58318174?s=40&v=4")
        .build();

    return OK(Arrays.asList(a1, a2, a3, a4));
  }
}
