package com.codesquad.issue;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class IssueDetail {

    private Long id;
    private String title;
    private String contents;
    private LocalDateTime createdAt;
    private Author author;
    private boolean isOpen;

    @Builder
    public IssueDetail(Long id, String title, String contents, LocalDateTime createdAt,
            Author author) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.createdAt = createdAt;
        this.author = author;
        this.isOpen = true;
    }
}
