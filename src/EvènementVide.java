public class EvènementVide implements Event {

    public EvènementVide(){}

    public void Action(Personnage perso) {
        System.out.println("Il ne se passe rien sur cette case");
    }
}