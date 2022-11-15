package VoitureTelecommande.Telecommande.ComposantsTel;
import VoitureTelecommande.Telecommande.Telecommande;

public class antenneTel extends ComposantsTel {
    private Telecommande telecommande;

    public Telecommande getTelecommande() {
        return this.telecommande;
    }

    public void setTelecommande(Telecommande telecommande) {
        this.telecommande = telecommande;
    }    
}
