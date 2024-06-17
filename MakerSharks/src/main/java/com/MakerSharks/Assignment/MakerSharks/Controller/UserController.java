package com.MakerSharks.Assignment.MakerSharks.Controller;

import com.MakerSharks.Assignment.MakerSharks.Entity.UserEntity;
import com.MakerSharks.Assignment.MakerSharks.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody UserEntity user) {
        return userService.registerUser(user);
    }

    @GetMapping("/fetch")
    public ResponseEntity<?> fetchUser(@RequestParam String username) {
        return userService.fetchUser(username);
    }
}

