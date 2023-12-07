package dev.mttw.students.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/admin")
public class AdminREST {

    @GetMapping(path = "/{username}")
    public boolean isAdmin(@PathVariable String username) {
        return false;
    }
}
