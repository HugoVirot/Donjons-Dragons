public class MoyenAttaque {
    private String nom;
    private int nivAttaque;

    public MoyenAttaque(){}

    public MoyenAttaque(String nomMA, int nivAttaqueMA){       //constructeur avec 2 paramètres
        System.out.println("Création réussie!");
        nom = nomMA;
        nivAttaque = nivAttaqueMA;
        System.out.println("Nom : " + nom + ", Attaque : " + nivAttaque);
    }

}
