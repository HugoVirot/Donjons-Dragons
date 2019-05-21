public class Sort {                 //Classe Sort avec attributs privés
    private String nomSort;
    private int nivAttaque;

    public Sort(String nomS, int nivAttaqueS) {           //constructeur avec 2 paramètres
        System.out.println("Création d'un nouveau Sort réussie!");
        nomSort = nomS;
        nivAttaque = nivAttaqueS;
        System.out.println("Nom : " + nomSort + ", Attaque : " + nivAttaque);
    }
}
