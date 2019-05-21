public class Bouclier {             //classe Bouclier avec attribut privé
    private String nomBouclier;

    public Bouclier(String nomB) {            //constructeur avec un seul paramètre
        System.out.println("Création d'un nouveau Bouclier réussie !");
        nomBouclier = nomB;
        System.out.println("Nom : " + nomBouclier);
    }
}
