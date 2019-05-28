import java.util.Random;

public class Case {
    private Event event;

    public Case() {
    }

    public void setEvent(int nombreAleatoire) {
        Random random = new Random();
        if (nombreAleatoire == 0) {
            event = new EvènementVide();
        } else if (nombreAleatoire == 1) {
            int nombreAleatoire2 = random.nextInt(2) ;
            if (nombreAleatoire2 == 0) {
                event = new Fruit();
            } else {
                event = new PowerUp();
            }
        } else {
            event = new Ennemi();
        }
    }

    public Event getEvent() {
        return event;
    }

}
