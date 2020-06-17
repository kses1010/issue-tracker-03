package com.codesquad.issue;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class IssueCreateResponse {

    private final Long issueId;

    public IssueCreateResponse(Long issueId) {
        this.issueId = issueId;
    }
}
