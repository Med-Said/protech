/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.pfe.Controller;

import com.example.pfe.Entities.Message;
import com.example.pfe.Repositories.MessageRepository;
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
public class MessageController {
@Autowired
    MessageRepository messageRepository;

    // Get All Messages
@GetMapping("/messages")
public List<Message> getAllMessages() {
    return (List<Message>) messageRepository.findAll();
}
    // Create a new Message
// Create a new Message
@PostMapping("/messages")
public Message createMessage(@Valid @RequestBody Message message) {
    return messageRepository.save(message);
}
    // Get a Single Message
// Get a Single Message
@GetMapping("/messages/{id}")
public Message getMessageById(@PathVariable(value = "id") Long messageId) {
    return messageRepository.findById(messageId)
            .orElseThrow(() -> new ResourceNotFoundException("Message", "id", messageId));
}
   // Update a Message

    // Delete a Message   
@DeleteMapping("/messages/{id}")
public ResponseEntity<?> deleteMessage(@PathVariable(value = "id") Long messageId) {
    Message message = messageRepository.findById(messageId)
            .orElseThrow(() -> new ResourceNotFoundException("Message", "id", messageId));

    messageRepository.delete(message);

    return ResponseEntity.ok().build();
}
}
