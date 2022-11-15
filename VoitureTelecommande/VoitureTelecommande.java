package VoitureTelecommande;

import VoitureTelecommande.Telecommande.Telecommande;
import VoitureTelecommande.Voiture.Voiture;

public class VoitureTelecommande {
    public String modèle;
    public int prix;
    public int stock;
    public String fabricant;

    private Voiture voiture;
    private Telecommande telecommande;

    public String getModèle() {
        return this.modèle;
    }

    public void setModèle(String modèle) {
        this.modèle = modèle;
    }

    public int getPrix() {
        return this.prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFabricant() {
        return this.fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public Voiture getVoiture() {
        return this.voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public Telecommande getTelecommande() {
        return this.telecommande;
    }

    public void setTelecommande(Telecommande telecommande) {
        this.telecommande = telecommande;
    }


    public void allumer(){
        System.out.println("VRRRRRRRROUUUUUUUUUMMMMMMMMMMMMMMMMMM");
    }
    public void avancer(){
        System.out.println("Foncez dans le tas");
    }
    public void reculer(){
        System.out.println("Foncez dans le mur");
    }
    public void tourner(){
        System.out.println("Drift");
    }
    public void freiner(){
        System.out.println("Freinage");
    }
    public void eteindre(){
        System.out.println("Mort");
    }
    public void allumerFeux(){
        System.out.println("Flash");
    }
    public void eteindreFeux(){
        System.out.println("Tout sombre");
    }
}
