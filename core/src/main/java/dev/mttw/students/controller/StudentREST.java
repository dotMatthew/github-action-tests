package dev.mttw.students.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentREST {

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String sayHelloWorld() {
        return "Hello World :)";
    }

    @GetMapping("/example/test")
    public String exampleRestEndpoint() {
        return "Example!";
    }
}
