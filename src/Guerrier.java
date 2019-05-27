public class Guerrier extends Personnage {
    /**
     * classe Guerrier, qui hérite de Personnage
     * ses attributs sont privés (non modifiables de l'extérieur)
     */

    private Arme arme;
    private Bouclier bouclier;

    public Guerrier() {
        /** constructeur basique sans paramètre, qui fait appel au même constructeur
         * de la classe mère Personnage, grâce à la fonction super()
         */
        super();
    }

    public Guerrier(String nomGuerrier) {
        /** constructeur avec un paramètre (idem)
         * @param nomGuerrier : nom choisi
         */
        super(nomGuerrier);
    }

    public Guerrier(String nomG, String imageG, int nivVie, int nivAttaque) throws NomImageTropLongsException {
        /** constructeur avec les 4 paramètres
         * @param nomG : nom du guerrier
         * @param imageG : image choisie
         * @param nivVie : niveau de vie
         * @param nivAttaque : niveau d'attaque
         * @exception NomImageTropLongsException : exception en cas de saisie de + de 20 caractères
         * fonction super pour envoyer les paramètres de ce constrcteur dans celui à 4 Paramètres de la classe personnage
         */
        super(nomG, imageG, nivVie, nivAttaque);
        System.out.println("Création d'un guerrier réussie !");
    }

    void getEquipement() {
        /**
         * méthode abstraite de personnage, redéfinie
         */
        System.out.println("Arme : " + arme + ", Bouclier : " + bouclier);
    }

    /**
     * setters pour attribuer arme et bouclier
     *
     * @param nouvelleArme
     */
    public void setMoyenAttaque(Arme nouvelleArme) {                       //
        arme = nouvelleArme;
    }

    /**
     * @param nouveauBouclier
     */
    public void setBouclier(Bouclier nouveauBouclier) {
        bouclier = nouveauBouclier;
    }

    /**
     * fonctions de récupération valeurs mini et maxi vie et attaque
     *
     * @return niveau min / max vie / attaque
     */
    public int getMinVie() {
        return 5;
    }

    public int getMaxVie() {
        return 10;
    }

    public int getMinAttaque() {
        return 5;
    }

    public int getMaxAttaque() {
        return 10;
    }
}
