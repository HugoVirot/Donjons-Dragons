public class Ennemi implements Event {
    private String nom;
    private int vie;
    private int attaque;

    public Ennemi(){
        vie = 20;
        attaque = 4;
    }

    public void Action(Personnage perso) {
        System.out.println("Attention ! Un ennemi !");
        int attaquePerso = perso.getAttaque();
        int viePerso = perso.getVie();
        while (vie > 0 && viePerso > 0)
        {
            System.out.println("Il vous attaque !");
            viePerso = viePerso - attaque;
            System.out.println("Il vous reste " + viePerso);
            System.out.println("Vous contre-attaquez !");
            vie = vie - attaquePerso;
        }
        if (vie == 0){
            System.out.println("Vous avez vaincu l'ennemi !");
        }
        if (viePerso == 0){
            System.out.println("Vous êtes mort...");
        }
    }

}