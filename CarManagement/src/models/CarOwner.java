package models;

import java.util.Date;

public class CarOwner {

    private int id;
    private String nom;
    private String prenom;
    private String tel;
    private int cni;
    private String dateNaissance;

    public CarOwner() {
    }

    public CarOwner(int cni, String nom, String prenom, String tel, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.cni = cni;
        this.dateNaissance = dateNaissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getCni() {
        return cni;
    }

    public void setCni(int cni) {
        this.cni = cni;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "CarOwner{" + "nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", cni=" + cni + ", dateNaissance=" + dateNaissance + '}';
    }

    
    
    
    
    
}
