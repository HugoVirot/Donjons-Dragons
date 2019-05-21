public class Personnage {
    private String nom;
    private String image;
    private int niveauVie;
    private int niveauAttaque;

    public Personnage () {

    }

    public Personnage(String nomP, String imageP, int nivVie, int nivAttaque) {
        nom = nomP;
        image = imageP;
        niveauVie = nivVie;
        niveauAttaque = nivAttaque;
        //System.out.println("Nom : " + nom + ", Image : " + image + ", Vie : " + niveauVie + ", Attaque : " + niveauAttaque);
    }

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
