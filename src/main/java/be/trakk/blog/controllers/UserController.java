package be.trakk.blog.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    public ResponseEntity<List<?>> getAll() {
        return ResponseEntity.ok().build();
    }
}
