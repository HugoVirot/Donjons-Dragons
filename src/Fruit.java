public class Fruit extends Bonus implements Event {

    public Fruit(){}

    public void Action(Personnage perso){
        System.out.println("Vous trouvez un fruit !");
        int vie = perso.getVie();
        vie = vie + 3;
        perso.setVie(vie);
        System.out.println("Vous le mangez et gagnez 3 points de vie ! Vie actuelle : " + perso.getVie() + " PV");
    }

    /*public void Action(Personnage perso) {
        perso.initVie();
    }*/


}