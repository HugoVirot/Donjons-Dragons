public class Guerrier extends Personnage {      //classe Guerrier, qui hérite de Personnage
    private Arme arme;                          //ses attributs sont privés (non modifiables de l'extérieur)
    private Bouclier bouclier;

    public Guerrier(){                       //constructeur basique sans paramètre, qui fait appel au même constructeur
        super();                            //de la classe mère Personnage, grâce à la fonction super()
    }

    public Guerrier(String nomGuerrier){    //constructeur avec un paramètre (idem)
        super(nomGuerrier);
    }

    public Guerrier (String nomG, String imageG, int nivVie, int nivAttaque) { //constructeur avec les 4 paramètres
    super(nomG, imageG, nivVie, nivAttaque);
    System.out.println("Création d'un guerrier réussie !");
    }

    void getEquipement() {                                                //méthode abstraite de personnage, redéfinie
        System.out.println("Arme : " + arme + ", Bouclier : " + bouclier);
    }

    public void setArme(Arme nouvelleArme) {                       //setters pour attribuer arme et bouclier
        arme = nouvelleArme;
    }

    public void setBouclier(Bouclier nouveauBouclier) {
        bouclier = nouveauBouclier;
    }
}
