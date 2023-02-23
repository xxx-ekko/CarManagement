package models;

import java.util.Date;

public class CarType {
    
    
    private int id;
    private String modele;
    private String transmision;
    private String matricule;
    private String marque;
    private Date annee;

    public CarType(String modele, String transmision, String matricule, String marque, Date annee) {
        this.modele = modele;
        this.transmision = transmision;
        this.matricule = matricule;
        this.marque = marque;
        this.annee = annee;
    }

    public CarType(int id, String modele, String transmision, String matricule, String marque, Date annee) {
        this.id = id;
        this.modele = modele;
        this.transmision = transmision;
        this.matricule = matricule;
        this.marque = marque;
        this.annee = annee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Voiture{" + "id=" + id + ", modele=" + modele + ", transmision=" + transmision + ", matricule=" + matricule + ", marque=" + marque + ", annee=" + annee + '}';
    }
    
    
    
    
}


