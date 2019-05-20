public class Arme {
    private String nomArme;
    private int nivAttaque;

    public Arme(String nomA, int nivAttaqueA){
        System.out.println("Création d'une nouvelle Arme réussie!");
        nomArme = nomA;
        nivAttaque = nivAttaqueA;
        System.out.println("Nom : " + nomArme + ", Attaque : " + nivAttaque);
    }
}