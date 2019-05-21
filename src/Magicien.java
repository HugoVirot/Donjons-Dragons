import java.lang.ref.PhantomReference;

public class Magicien extends Personnage {
    private Sort sort;
    private Philtre philtre;

    public Magicien() {
    }

    public Magicien(String nomMagicien) {
    }

    public Magicien (String nomM, String imageM, int nivVie, int nivAttaque) {
        super(nomM, imageM, nivVie, nivAttaque);

    }

    public void setSort(Sort nouveauSort) {
        sort = nouveauSort;
    }

    public void setPhiltre(Philtre nouveauPhiltre) {
        philtre = nouveauPhiltre;
    }
}
