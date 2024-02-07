package dev.mttw.students.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test")
public class TestREST {

  @GetMapping
  public String testEndpoint() {
    return "Hello!";
  }

}
