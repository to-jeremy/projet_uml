package VoitureTelecommande.Voiture.ComposantsVoiture;
import VoitureTelecommande.Voiture.Voiture;

public class diodeVoiture extends ComposantsVoiture{
    private Voiture voiture;
    public String couleur;

    public Voiture getVoiture() {
        return this.voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
