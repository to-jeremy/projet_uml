package VoitureTelecommande.Voiture.ComposantsVoiture;
import VoitureTelecommande.Voiture.Voiture;

public class carteVoiture extends ComposantsVoiture{
    private Voiture voiture;

    public Voiture getVoiture() {
        return this.voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
}
