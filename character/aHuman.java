package character;
import java.util.Random;

public class aHuman extends Player {
    Random r = new Random();
    public aHuman() {
        this.name=name;
        attribute="Light";
        race="Human";
        this.clazz=clazz;
        health=120+r.nextInt(50);
        intel=80+r.nextInt(70);
        stamina=130+r.nextInt(50);
        attack=2+r.nextInt(3);
        defense=2+r.nextInt(3);

    }
}