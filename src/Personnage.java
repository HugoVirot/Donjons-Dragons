abstract class Personnage {         //classe abstraite dont héritent Guerrier et Magicien
    private String nom;
    private String image;
    private int niveauVie;
    private int niveauAttaque;

    abstract void getEquipement();  //méthode abstraite redéfinie dans les enfants Guerrier et Magicien

    public Personnage () {          //constructeur simple sans paramètres
        this.niveauVie=5;           //il peut quand même attribuer des valeurs par défaut
    }

    public Personnage(String nomChoisi) {   //constructeur avec juste un paramètre
        nom = nomChoisi;
    }

    public Personnage(String nomP, String imageP, int nivVie, int nivAttaque) {   //constructeur avec les 4 paramètres
        nom = nomP;
        image = imageP;
        niveauVie = nivVie;
        niveauAttaque = nivAttaque;
        //System.out.println("Nom : " + nom + ", Image : " + image + ", Vie : " + niveauVie + ", Attaque : " + niveauAttaque);
    }

    public String getInfos() {                      //fonction "getter" pour récupérer les informations sur le personnage
        return ("Nom : " + nom + ", Image : " + image + ", Vie : " + niveauVie + ", Attaque : " + niveauAttaque);
    }

    public void setNom(String nouveauNom)       //"setters" pour modifier respectivement le nom, l'image, la vie et l'attaque
    {
        nom = nouveauNom;
    }

    public void setImage(String nouvelleImage)
    {
        image = nouvelleImage;
    }

    public void setVie(int nouvelleVie)
    {
        niveauVie = nouvelleVie;
    }

    public void setAttaque(int nouvelleAttaque)
    {
        niveauAttaque = nouvelleAttaque;
    }
}
