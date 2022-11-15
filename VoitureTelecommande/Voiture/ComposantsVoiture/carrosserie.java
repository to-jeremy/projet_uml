package VoitureTelecommande.Voiture.ComposantsVoiture;
import VoitureTelecommande.Voiture.Voiture;

public class carrosserie extends ComposantsVoiture{
    private Voiture voiture;
    public String couleur;
    public String composition;

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

    public String getComposition() {
        return this.composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
}
