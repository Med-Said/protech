/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rimsoft.cv.Model;

/**
 *
 * @author Med Said M'bareck
 * 
to do 
create a spring boot projet whith classes:
-cv : name, prenom ,age , birthdate
-generate getter & setter and toString
-display : every variable under name
-afficher la method to String en commun
 */
public class Cv {
    private String nom;
    private String prenom;
    private int age;
    private String dateNaissance;

        public Cv() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
        this.dateNaissance = "";
    }
    
    public Cv(String nom, String prenom, int age, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaissance = dateNaissance;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Cv{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", dateNaissance=" + dateNaissance + '}';
    } 
}
