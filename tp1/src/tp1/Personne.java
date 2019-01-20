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
public class Personne {
    private String nom;
    private String prnom;
    private String mail;
    private int tel;
    
    
    
     public Personne() {
        
    }

    public Personne(String nom, String prnom, String mail, int tel) {
        this.nom = nom;
        this.prnom = prnom;
        this.mail = mail;
        this.tel = tel;
    }

    
    public String getNom() {
        return nom;
    }

    public String getPrnom() {
        return prnom;
    }

    public String getMail() {
        return mail;
    }

    public int getTel() {
        return tel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrnom(String prnom) {
        this.prnom = prnom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prnom=" + prnom + ", mail=" + mail + ", tel=" + tel + '}';
    }
    
    
    
    
}
