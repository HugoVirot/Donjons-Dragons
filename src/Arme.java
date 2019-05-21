public class Arme {       //classe Arme avec attributs privés
    private String nomArme;
    private int nivAttaque;

    public Arme(String nomA, int nivAttaqueA){       //constructeur avec 2 paramètres
        System.out.println("Création d'une nouvelle Arme réussie!");
        nomArme = nomA;
        nivAttaque = nivAttaqueA;
        System.out.println("Nom : " + nomArme + ", Attaque : " + nivAttaque);
    }
}