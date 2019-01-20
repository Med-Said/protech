/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Med Said M'bareck
 */
@RestController
public class ctr {
    
    @GetMapping("/")
    String hello(){
        return "hello boot <a href='easy'>try</a>";
    }
    
    
    @GetMapping("easy")
    String spring(){
        return "spring boot is easy";
    }
}
