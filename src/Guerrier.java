public class Guerrier extends Personnage {
    private Arme arme;
    private Bouclier bouclier;

    public Guerrier(){
    }

    public Guerrier(String nomGuerrier){
    }

    public Guerrier (String nomG, String imageG, int nivVie, int nivAttaque) {
    super(nomG, imageG, nivVie, nivAttaque);

    }

    public void setArme(Arme nouvelleArme) {
        arme = nouvelleArme;
    }

    public void setBouclier(Bouclier nouveauBouclier) {
        bouclier = nouveauBouclier;
    }
}
