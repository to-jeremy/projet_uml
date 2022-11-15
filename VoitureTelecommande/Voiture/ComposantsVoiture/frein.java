package VoitureTelecommande.Voiture.ComposantsVoiture;
import VoitureTelecommande.Voiture.Voiture;

public class frein extends ComposantsVoiture{
    private Voiture voiture;
    public int forceFreinage;

    public Voiture getVoiture() {
        return this.voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public int getForceFreinage() {
        return this.forceFreinage;
    }

    public void setForceFreinage(int forceFreinage) {
        this.forceFreinage = forceFreinage;
    }
}
