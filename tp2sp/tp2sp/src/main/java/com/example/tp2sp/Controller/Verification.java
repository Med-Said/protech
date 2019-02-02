/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp2sp.Controller;

import com.example.tp2sp.Model.Premier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Med Said M'bareck
 */
@RestController
public class Verification {
    
    @GetMapping("/")
    public String calcul(){
        
        Premier p = new Premier();
        p.setNumber(11);
        return p.premier();
    }
}
