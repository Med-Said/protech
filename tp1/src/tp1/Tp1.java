/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Med Said M'bareck
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(pgcd(1755 ,1053));
    }




    public  static int pgcd(int a, int b){
        while(a!=b){
            if (a>b)
            a = a-b;
        else 
            b = b-a;
        }
        
        return a;
    } 
}
