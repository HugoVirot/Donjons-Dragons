public class MoyenAttaque {
    /**
     * classe qui définit le moyen d'attaque du personnage. 2 attributs privés.
     */
    private String nom;
    private int nivAttaque;

    public MoyenAttaque() {
    }

    public MoyenAttaque(String nomMA, int nivAttaqueMA) {
        /** constructeur avec 2 paramètres, affichés lors du succès de la création d'un moyen d'attaque
         * @param nomMA
         * @param nivAttaque
         */
        System.out.println("Création réussie!");
        nom = nomMA;
        nivAttaque = nivAttaqueMA;
        System.out.println("Nom : " + nom + ", Attaque : " + nivAttaque);
    }

}
