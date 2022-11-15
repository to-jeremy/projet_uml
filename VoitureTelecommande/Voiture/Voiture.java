package VoitureTelecommande.Voiture;

import java.util.ArrayList;
import java.util.List;

public class Voiture{
    public static String modèle;
    public static double poidsTotal;
    
    private VoitureTelecommande.Voiture.ComposantsVoiture.antenneVoiture antenneVoiture;
    private VoitureTelecommande.Voiture.ComposantsVoiture.batterie batterie;
    private VoitureTelecommande.Voiture.ComposantsVoiture.carrosserie carrosserie;
    private VoitureTelecommande.Voiture.ComposantsVoiture.carteVoiture carteVoiture;
    private VoitureTelecommande.Voiture.ComposantsVoiture.diodeVoiture diodeVoiture;
    private List<VoitureTelecommande.Voiture.ComposantsVoiture.feux> feux = new ArrayList<>();
    private List<VoitureTelecommande.Voiture.ComposantsVoiture.frein> frein = new ArrayList<>();
    private List<VoitureTelecommande.Voiture.ComposantsVoiture.roues> roues = new ArrayList<>();


    public VoitureTelecommande.Voiture.ComposantsVoiture.antenneVoiture getAntenneVoiture() {
        return this.antenneVoiture;
    }

    public void setAntenneVoiture(VoitureTelecommande.Voiture.ComposantsVoiture.antenneVoiture antenneVoiture) {
        this.antenneVoiture = antenneVoiture;
    }

    public VoitureTelecommande.Voiture.ComposantsVoiture.batterie getBatterie() {
        return this.batterie;
    }

    public void setBatterie(VoitureTelecommande.Voiture.ComposantsVoiture.batterie batterie) {
        this.batterie = batterie;
    }

    public VoitureTelecommande.Voiture.ComposantsVoiture.carrosserie getCarrosserie() {
        return this.carrosserie;
    }

    public void setCarrosserie(VoitureTelecommande.Voiture.ComposantsVoiture.carrosserie carrosserie) {
        this.carrosserie = carrosserie;
    }

    public VoitureTelecommande.Voiture.ComposantsVoiture.carteVoiture getCarteVoiture() {
        return this.carteVoiture;
    }

    public void setCarteVoiture(VoitureTelecommande.Voiture.ComposantsVoiture.carteVoiture carteVoiture) {
        this.carteVoiture = carteVoiture;
    }

    public VoitureTelecommande.Voiture.ComposantsVoiture.diodeVoiture getDiodeVoiture() {
        return this.diodeVoiture;
    }

    public void setDiodeVoiture(VoitureTelecommande.Voiture.ComposantsVoiture.diodeVoiture diodeVoiture) {
        this.diodeVoiture = diodeVoiture;
    }

    public List<VoitureTelecommande.Voiture.ComposantsVoiture.feux> getFeux() {
        return this.feux;
    }

    public void setFeux(List<VoitureTelecommande.Voiture.ComposantsVoiture.feux> feux) {
        this.feux = feux;
    }

    public List<VoitureTelecommande.Voiture.ComposantsVoiture.frein> getFrein() {
        return this.frein;
    }

    public void setFrein(List<VoitureTelecommande.Voiture.ComposantsVoiture.frein> frein) {
        this.frein = frein;
    }

    public List<VoitureTelecommande.Voiture.ComposantsVoiture.roues> getRoues() {
        return this.roues;
    }

    public void setRoues(List<VoitureTelecommande.Voiture.ComposantsVoiture.roues> roues) {
        this.roues = roues;
    }
}
