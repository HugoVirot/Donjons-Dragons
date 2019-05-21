public class Philtre {           //classe Philtre avec attribut privé
    private String nomPhiltre;

    public Philtre(String nomP){           //constructeur avec un seul paramètre
        System.out.println("Création d'un nouveau Philtre réussie !");
        nomPhiltre = nomP;
        System.out.println("Nom : " + nomPhiltre);
    }
}
