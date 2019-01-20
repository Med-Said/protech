/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.grh.Controller;

import com.example.grh.Model.User;
import com.example.grh.Repository.UserRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Med Said M'bareck
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    // Get All Users
@GetMapping("/users")
public List<User> getAllUsers() {
    return (List<User>) userRepository.findAll();
}
@PostMapping("/users")
public User createUser(@Valid @RequestBody User user) {
    return userRepository.save(user);
}
}
