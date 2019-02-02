/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rimsoft.cv.Controller;

import com.rimsoft.cv.Model.Cv;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Med Said M'bareck
 */
@RestController
public class CvController {
    Cv cv = new Cv("M'bareck","Mohamed Said",24,"21/08/1995");
    @GetMapping("/nom")
    public  String getNom(){
        return "Nom : " + cv.getNom();
    }
    
    @GetMapping("/prenom")
    public  String getPrenom(){
        return "Prenom : " + cv.getPrenom();
    }
    
    @GetMapping("/naissance")
    public  String getDateNaissance(){
        return "Naissance : " + cv.getDateNaissance();
    }
    
    @GetMapping("/age")
    public  String getAge(){
        return "Age : " +  String.valueOf(cv.getAge());
    }
    
    @GetMapping("/all")
    public String allData(){
        return cv.toString();
    }
       
}
