package VoitureTelecommande.Telecommande.ComposantsTel;
import VoitureTelecommande.Telecommande.Telecommande;

public class boutons extends ComposantsTel{
    private Telecommande telecommande;
    public String forme;

    public Telecommande getTelecommande() {
        return this.telecommande;
    }

    public void setTelecommande(Telecommande telecommande) {
        this.telecommande = telecommande;
    }

    public String getForme() {
        return this.forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }
}
