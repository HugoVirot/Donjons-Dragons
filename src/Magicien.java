public class Magicien extends Personnage {       //classe Magicien, qui hérite de Personnage
    private Sort sort;                            //ses attributs sont privés (non modifiables de l'extérieur)
    private Philtre philtre;

    public Magicien() {                          //constructeur basique sans paramètre, qui fait appel au même constructeur
        super();                                 //de la classe mère Personnage, grâce à la fonction super()
    }

    public Magicien(String nomMagicien) {       //constructeur avec un paramètre (idem)
        super(nomMagicien);
    }

    public Magicien (String nomM, String imageM, int nivVie, int nivAttaque) throws NomImageTropLongsException {  //constructeur avec les 4 paramètres
        super(nomM, imageM, nivVie, nivAttaque);
        System.out.println("Création d'un magicien réussie !");
    }

    void getEquipement() {                                          //méthode abstraite de personnage, redéfinie
        System.out.println("Sort : " + sort + ", Philtre : " + philtre);
    }

    public void setSort(Sort nouveauSort) {          //setters pour attribuer sort et philtre
        sort = nouveauSort;
    }

    public void setPhiltre(Philtre nouveauPhiltre) {
        philtre = nouveauPhiltre;
    }
}
