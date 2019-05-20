public class Guerrier extends Personnage {
    private Arme arme;
    private Bouclier bouclier;

    public Guerrier(){
    }

    public Guerrier(String nomGuerrier){
    }

    public Guerrier(String nomG, String imageG, int nivVie, int nivAttaque) {
        System.out.println("Création d'un nouveau Guerrier réussie !");
        nom = nomG;
        image = imageG;
        niveauVie = nivVie;
        niveauAttaque = nivAttaque;
        //System.out.println("Nom : " + nom + ", Image : " + image + ", Vie : " + niveauVie + ", Attaque : " + niveauAttaque);
    }

    public void setArme(Arme nouvelleArme) {
        arme = nouvelleArme;
    }

    public void setBouclier(Bouclier nouveauBouclier) {
        bouclier = nouveauBouclier;
    }
}
