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
public class Prof extends Personne{
    private String matiere;

    public Prof() {
    }

    public Prof(String nom, String prnom, String mail, int tel, String matiere) {
        super(nom, prnom, mail, tel);
        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }   

    @Override
    public String toString() {
        return "Prof{" + "matiere=" + matiere + '}';
    }
    
    
    public static void main(String arg[]){
//        Prof p1 = new Personne();
    }
}
