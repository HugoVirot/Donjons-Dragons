import java.lang.ref.PhantomReference;

public class Magicien extends Personnage {
    private Sort sort;
    private Philtre philtre;

    public Magicien() {
    }

    public Magicien(String nomMagicien) {
        super(nomMagicien);
    }

    void getEquipement() {
        System.out.println("Sort : " + sort + ", Philtre : " + philtre);
    }

    public Magicien (String nomM, String imageM, int nivVie, int nivAttaque) {
        super(nomM, imageM, nivVie, nivAttaque);
        System.out.println("Création d'un magicien réussie !");
    }

    public void setSort(Sort nouveauSort) {
        sort = nouveauSort;
    }

    public void setPhiltre(Philtre nouveauPhiltre) {
        philtre = nouveauPhiltre;
    }
}
