public class Arme extends MoyenAttaque {
    /**
     * classe Arme, fille de MoyenAttaque avec attributs privés
     */
    public Arme(String nomArme, int attaqueArme) {
        /** constructeur avec 2 paramètres, qui fait appel au constructeur correspondant de MoyenAttaque grâce à super
         * @param nomArme
         * @param attaqueArme
         */
        super(nomArme, attaqueArme);
    }

}