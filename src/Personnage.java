public class Personnage {
    String nom;
    String image;
    int niveauVie;
    int niveauAttaque;

    public String getInfos() {
        return ("Nom : " + nom + ", Image : " + image + ", Vie : " + niveauVie + ", Attaque : " + niveauAttaque);
    }

    public void setNom(String nouveauNom)
    {
        nom = nouveauNom;
    }

    public void setImage(String nouvelleImage)
    {
        image = nouvelleImage;
    }

    public void setVie(int nouvelleVie)
    {
        niveauVie = nouvelleVie;
    }

    public void setAttaque(int nouvelleAttaque)
    {
        niveauAttaque = nouvelleAttaque;
    }
}
