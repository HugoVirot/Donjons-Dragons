public class Sort {
    private String nomSort;
    private int nivAttaque;

    public Sort(String nomS, int nivAttaqueS) {
        System.out.println("Création d'un nouveau Sort réussie!");
        nomSort = nomS;
        nivAttaque = nivAttaqueS;
        System.out.println("Nom : " + nomSort + ", Attaque : " + nivAttaque);
    }
}
