package VoitureTelecommande.Voiture.ComposantsVoiture;
import VoitureTelecommande.Voiture.Voiture;

public class roues extends ComposantsVoiture{
    private Voiture voiture;
    public int taille;

    public Voiture getVoiture() {
        return this.voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public int getTaille() {
        return this.taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
