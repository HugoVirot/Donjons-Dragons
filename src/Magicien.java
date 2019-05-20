import java.lang.ref.PhantomReference;

public class Magicien extends Personnage {
    private Sort sort;
    private Philtre philtre;

    public Magicien() {
    }

    public Magicien(String nomMagicien) {
    }

    public Magicien(String nomM, String imageM, int nivVie, int nivAttaque) {
        System.out.println("Création d'un nouveau Magicien réussie!");
        nom = nomM;
        image = imageM;
        niveauVie = nivVie;
        niveauAttaque = nivAttaque;
        //System.out.println("Nom : " + nom + ", Image : " + image + ", Vie : " + niveauVie + ", Attaque : " + niveauAttaque);
    }

    public void setSort(Sort nouveauSort) {
        sort = nouveauSort;
    }

    public void setPhiltre(Philtre nouveauPhiltre) {
        philtre = nouveauPhiltre;
    }
}
