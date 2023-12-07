package dev.mttw.students.controller;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserREST {

    @GetMapping(path = "/{username}")
    public boolean isUser(@PathVariable String username) {
        return true;
    }

    @DeleteMapping(path = "/{username}")
    public boolean deleteUser(@PathVariable String username) {
        return true;
    }
}
