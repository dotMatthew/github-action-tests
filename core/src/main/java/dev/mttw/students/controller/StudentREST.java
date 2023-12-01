package dev.mttw.students.controller;

import dev.mttw.students.dto.CreateStudentDTO;
import dev.mttw.students.service.StudentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Getter
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/students")
public class StudentREST {
    private final StudentService studentService;

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String sayHelloWorld() {
        return "Hello World :)";
    }

    @GetMapping("/example/test")
    public String exampleRestEndpoint() {
        return "Example!";
    }

    @GetMapping(path = "/{id}")
    public boolean doesStudentExist(@PathVariable() long id) {
        return this.getStudentService().doesStudentExist(id);
    }

    @PostMapping
    public long createStudent(@RequestBody CreateStudentDTO dto) {
        return this.getStudentService().createStudent(dto);
    }
}
