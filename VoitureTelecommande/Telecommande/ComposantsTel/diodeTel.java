package VoitureTelecommande.Telecommande.ComposantsTel;
import VoitureTelecommande.Telecommande.Telecommande;

public class diodeTel extends ComposantsTel{
    private Telecommande telecommande;
    public String couleur;

    public Telecommande getTelecommande() {
        return this.telecommande;
    }

    public void setTelecommande(Telecommande telecommande) {
        this.telecommande = telecommande;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
