/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.pfe.Controller;

import com.example.pfe.Entities.User;
import com.example.pfe.Repositories.UserRepository;
import com.example.pfe.exception.ResourceNotFoundException;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author khali
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
    // Create a new User
// Create a new User
@PostMapping("/users")
public User createUser(@Valid @RequestBody User user) {
    return userRepository.save(user);
}
    // Get a Single User
// Get a Single User
@GetMapping("/users/{id}")
public User getUserById(@PathVariable(value = "id") Long userId) {
    return userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
}
   // Update a User
@PutMapping("/users/{id}")
public User updateUser(@PathVariable(value = "id") Long userId,
                                        @Valid @RequestBody User userDetails) {

    User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

    user.setNom(userDetails.getNom());
    user.setPrenom(userDetails.getPrenom());
    user.setLogin(userDetails.getLogin());
    user.setMdp(userDetails.getMdp());

    User updatedUser = userRepository.save(user);
    return updatedUser;
}
    // Delete a User   
@DeleteMapping("/users/{id}")
public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
    User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

    userRepository.delete(user);

    return ResponseEntity.ok().build();
}
}
