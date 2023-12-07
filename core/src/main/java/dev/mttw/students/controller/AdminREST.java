package dev.mttw.students.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/admin")
public class AdminREST {

    @GetMapping(path = "/{username}")
    public boolean isAdmin(@PathVariable String username) {
        return false;
    }


    @DeleteMapping(path = "/{username}")
    public boolean deleteAdmin(@PathVariable String username) {
        return true;
    }
}
