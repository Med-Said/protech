/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp2sp.Model;

/**
 *
 * @author Med Said M'bareck
 */
public class Premier {
    private int number;

    public Premier(int number) {
        this.number = number;
    }
    
     public Premier() {
        this.number = 0;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    public String premier(){
        int i =2;
        while((i<number/2) && (number % 2 != 0)){
            i++;
            
        }
        if(i % 2 != 0)
            return this.number + "est premier";
        else 
            return this.number + "n'est pas premier";
            
    }
}
