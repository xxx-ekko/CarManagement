package models;

import java.util.Date;

public class CarOwner {
    private int id;
    private String nom;
    private String prenom;
    private String tel;
    private int cni;
    private Date dateNaissance;

    public CarOwner(int id, String nom, String prenom, String tel, int cni, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.cni = cni;
        this.dateNaissance = dateNaissance;
    }

    public CarOwner(int cni,String nom, String prenom, String tel, Date dateNaissance) {
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    
    
}
