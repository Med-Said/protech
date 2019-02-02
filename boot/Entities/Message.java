/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pfe.Entities;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author khali
 */
  @Entity
@Table(name = "Message")
@EntityListeners(AuditingEntityListener.class)
public class Message {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Null
private String titre;
@NotBlank
private String texte;
@NotBlank
private String date;
@NotBlank
private int emmetteur;
@NotBlank
private int recepteur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getEmmetteur() {
        return emmetteur;
    }

    public void setEmmetteur(int emmetteur) {
        this.emmetteur = emmetteur;
    }

    public int getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(int recepteur) {
        this.recepteur = recepteur;
    }

      
      
      
}
