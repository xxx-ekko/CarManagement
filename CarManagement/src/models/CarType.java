package models;

import java.util.Date;

public class CarType {

    private int id;
    private String matricule;
    private String marque;
    private String modele;
    private String transmission;
    private int annee;
    private int id_co;

    public CarType() {
    }

    public CarType(String matricule, String marque, String modele, String transmission, int annee, int id_co) {
        this.matricule = matricule;
        this.marque = marque;
        this.modele = modele;
        this.transmission = transmission;
        this.annee = annee;
        this.id_co= id_co;
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

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getId_co() {
        return id_co;
    }

    public void setId_co(int id_co) {
        this.id_co = id_co;
    }

    @Override
    public String toString() {
        return "CarType{" + "matricule=" + matricule + ", marque=" + marque + ", modele=" + modele + ", transmission=" + transmission + ", annee=" + annee + ", id_co=" + id_co + '}';
    }
    
    

}
