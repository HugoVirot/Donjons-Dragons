public class PowerUp extends Bonus implements Event {

    public PowerUp(){}

    public void Action(Personnage perso){
        System.out.println("Vous trouvez un power-up !");
        int attaque = perso.getAttaque();
        attaque = attaque + 3;
        perso.setAttaque(attaque);
        System.out.println("Il vous fait gagner 3 points d'attaque ! Attaque actuelle : " + perso.getAttaque() + " PA");
    }

}
