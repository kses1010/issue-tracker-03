package com.codesquad.issue;

import static com.codesquad.issue.api.ApiResult.ERROR;

import com.codesquad.issue.api.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionHandler {

  private static final Logger log = LoggerFactory.getLogger(GeneralExceptionHandler.class);

  private ResponseEntity<ApiResult> newResponse(Exception exception, HttpStatus status) {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add("ContentType", "application/json");
    return new ResponseEntity<>(ERROR(exception, status), httpHeaders, status);
  }

  @ExceptionHandler(Exception.class)
  protected ResponseEntity<?> exception(Exception e) {
    log.debug("예외를 잡았다!");
    return newResponse(e, HttpStatus.NOT_ACCEPTABLE);
  }
}
