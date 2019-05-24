public class MoyenDefense {
    private String nom;

    public MoyenDefense() {
    }

    public MoyenDefense(String nomMD) {            //constructeur avec un seul paramètre
        System.out.println("Création réussie !");
        nom = nomMD;
        System.out.println("Nom : " + nom);
    }
}