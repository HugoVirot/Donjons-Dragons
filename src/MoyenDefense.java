public class MoyenDefense {
    /**
     * classe qui définit le moyen d'attaque du personnage. 1 attribut privés.
     */
    private String nom;

    public MoyenDefense() {
    }

    public MoyenDefense(String nomMD) {
        /** constructeur avec 1 paramètre, affiché lors du succès de la création d'un moyen d'attaque
         * @param nomMD
         */
        System.out.println("Création réussie !");
        nom = nomMD;
        System.out.println("Nom : " + nom);
    }
}