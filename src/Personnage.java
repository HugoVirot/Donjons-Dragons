abstract class Personnage {         //classe abstraite dont héritent Guerrier et Magicien
    private String nom;
    private String image;
    private int niveauVie;
    private int niveauAttaque;
    private MoyenAttaque moyenattaque;
    private MoyenDefense moyendefense;

    abstract void getEquipement();  //méthode abstraite redéfinie dans les enfants Guerrier et Magicien

    public Personnage() {          //constructeur simple sans paramètres
        // this.niveauVie = 5;           //il peut quand même attribuer des valeurs par défaut
    }

    public Personnage(String nomChoisi) {   //constructeur avec juste un paramètre
        nom = nomChoisi;
    }

    public Personnage(String nomP, String imageP, int nivVie, int nivAttaque)    //constructeur avec les 4 paramètres
            throws NomImageTropLongsException {
        if (nomP.length() > 21)
            throw new NomImageTropLongsException();
        else if (imageP.length() > 21)
            throw new NomImageTropLongsException();
        else {
            nom = nomP;
            image = imageP;
            niveauVie = nivVie;
            niveauAttaque = nivAttaque;
            //System.out.println("Nom : " + nom + ", Image : " + image + ", Vie : " + niveauVie + ", Attaque : " + niveauAttaque);
        }
    }

    public String getInfos() {                      //fonction "getter" pour récupérer les informations sur le personnage
        return ("Nom : " + nom + ", Image : " + image + ", Vie : " + niveauVie + ", Attaque : " + niveauAttaque);
    }

    public int getVie() {
        return niveauVie;
    }

    public int getAttaque() {
        return niveauAttaque;
    }

    public void setNom(String nomP)       //"setters" pour modifier respectivement le nom, l'image, la vie et l'attaque
            throws NomImageTropLongsException {
        {
            if (nomP.length() > 21)
                throw new NomImageTropLongsException();
            else {
                nom = nomP;
            }
        }
    }

    public void setImage(String imageP)
            throws NomImageTropLongsException {
        {
            if (imageP.length() > 21)
                throw new NomImageTropLongsException();
            else {
                image = imageP;
            }
        }
    }

    public void initVie() {
        niveauVie = getMinVie() + (int) (Math.random() * ((getMaxVie() - getMinVie()) + 1));
    }

    public void initAttaque() {
        niveauAttaque = getMinAttaque() + (int) (Math.random() * ((getMaxAttaque() - getMinAttaque()) + 1));
    }

    public void setAttaque(int attaqueMin, int attaqueMax) {
        niveauAttaque = attaqueMin + (int) (Math.random() * ((attaqueMax - attaqueMin) + 1));
    }

    public void setMoyenAttaque(MoyenAttaque moyenAttaque){
        moyenattaque = moyenAttaque;
    }

    public void setMoyenDefense(MoyenDefense moyenDefense){
        moyendefense = moyenDefense;
    }

    public abstract int getMinVie();
    public abstract int getMaxVie();
    public abstract int getMinAttaque();
    public abstract int getMaxAttaque();
}
