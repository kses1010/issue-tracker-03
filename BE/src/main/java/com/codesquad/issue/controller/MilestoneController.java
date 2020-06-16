package com.codesquad.issue.controller;

import com.codesquad.issue.MileStone;
import com.codesquad.issue.api.ApiResult;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("milestones")
public class MilestoneController {

  @GetMapping
  public ApiResult<List<MileStone>> findAll() {
    MileStone m1 = new MileStone("1주차");
    MileStone m2 = new MileStone("2주차");
    MileStone m3 = new MileStone("3주차");

    return ApiResult.OK(Arrays.asList(m1, m2, m3));
  }

}
