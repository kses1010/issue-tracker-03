package com.codesquad.issue.global.utils;

import com.codesquad.issue.domain.account.AccountResponse;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class JwtUtilsTest {

    @Test
    void JWT토큰파서() {
        AccountResponse response = new AccountResponse("kses1010","avatarurl");
        String jwt = JwtUtils.jwtCreate(response);
        AccountResponse parserJwt = JwtUtils.jwtParsing(jwt);
        assertThat(parserJwt.getUserId()).isEqualTo(response.getUserId());
        assertThat(parserJwt.getAvatarUrl()).isEqualTo(response.getAvatarUrl());
    }
}
