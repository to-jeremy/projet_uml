package VoitureTelecommande.Voiture.ComposantsVoiture;
import VoitureTelecommande.Voiture.Voiture;

public class feux extends ComposantsVoiture{
    private Voiture voiture;
    public int puissance;
    public String couleur;

    public Voiture getVoiture() {
        return this.voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
