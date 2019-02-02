/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp1sp.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Med Said M'bareck
 */
@RestController
public class FirstControler {
    
    @GetMapping("/")
    public String hello(){
        return "Hello spring";
    }
    
    
    @GetMapping("/next")
    public String next(){
        return "I love java programming !";
    }
    
}
