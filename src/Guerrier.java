public class Guerrier extends Personnage {
    private Arme arme;
    private Bouclier bouclier;

    public Guerrier(){
        super();
    }

    public Guerrier(String nomGuerrier){
        super(nomGuerrier);
    }

    void getEquipement() {
        System.out.println("Arme : " + arme + ", Bouclier : " + bouclier);
    }

    public Guerrier (String nomG, String imageG, int nivVie, int nivAttaque) {
    super(nomG, imageG, nivVie, nivAttaque);
    System.out.println("Création d'un guerrier réussie !");
    }

    public void setArme(Arme nouvelleArme) {
        arme = nouvelleArme;
    }

    public void setBouclier(Bouclier nouveauBouclier) {
        bouclier = nouveauBouclier;
    }
}
