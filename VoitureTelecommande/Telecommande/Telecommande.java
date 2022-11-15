package VoitureTelecommande.Telecommande;

import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    public static String modèle;
    public static double poidsTotal;

    private VoitureTelecommande.Telecommande.ComposantsTel.antenneTel antenneTel;
    private VoitureTelecommande.Telecommande.ComposantsTel.carteTel carteTel;
    private VoitureTelecommande.Telecommande.ComposantsTel.diodeTel diodeTel;
    private VoitureTelecommande.Telecommande.ComposantsTel.boitier boitier;
    private List<VoitureTelecommande.Telecommande.ComposantsTel.piles> piles = new ArrayList<>();
    private List<VoitureTelecommande.Telecommande.ComposantsTel.boutons> boutons = new ArrayList<>();

    public VoitureTelecommande.Telecommande.ComposantsTel.antenneTel getAntenneTel() {
        return this.antenneTel;
    }

    public void setAntenneTel(VoitureTelecommande.Telecommande.ComposantsTel.antenneTel antenneTel) {
        this.antenneTel = antenneTel;
    }

    public VoitureTelecommande.Telecommande.ComposantsTel.carteTel getCarteTel() {
        return this.carteTel;
    }

    public void setCarteTel(VoitureTelecommande.Telecommande.ComposantsTel.carteTel carteTel) {
        this.carteTel = carteTel;
    }

    public VoitureTelecommande.Telecommande.ComposantsTel.diodeTel getDiodeTel() {
        return this.diodeTel;
    }

    public void setDiodeTel(VoitureTelecommande.Telecommande.ComposantsTel.diodeTel diodeTel) {
        this.diodeTel = diodeTel;
    }

    public VoitureTelecommande.Telecommande.ComposantsTel.boitier getBoitier() {
        return this.boitier;
    }

    public void setBoitier(VoitureTelecommande.Telecommande.ComposantsTel.boitier boitier) {
        this.boitier = boitier;
    }

    public List<VoitureTelecommande.Telecommande.ComposantsTel.piles> getPiles() {
        return this.piles;
    }

    public void setPiles(List<VoitureTelecommande.Telecommande.ComposantsTel.piles> piles) {
        this.piles = piles;
    }

    public List<VoitureTelecommande.Telecommande.ComposantsTel.boutons> getBoutons() {
        return this.boutons;
    }

    public void setBoutons(List<VoitureTelecommande.Telecommande.ComposantsTel.boutons> boutons) {
        this.boutons = boutons;
    }
}