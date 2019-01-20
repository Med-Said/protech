/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

/**
 *
 * @author Med Said M'bareck
 */
public class Calcule {
    int a,b;

    public Calcule() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    
    public int max(){//html : langage de description de donnees
        if(a>b)
            return a;
        else 
            return b;
    }
    
    public double fact(int a){
//        double res  ;
//        res = a*(fact(a-1));
//        
//        return res;

    double res = 1;
    for(int i = 2; i <= a; i++){
        res *= i;
    }
    return res;
    }
    
}
