package duck;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 6510450305 chaiyapat
 */

public class Flock implements Quackable{
    List<Quackable> quackables = new ArrayList<>();

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        System.out.println("---Flock---");
        if (quackables.size() >= 0) {
            Quackable leader = quackables.get(0);
            leader.quack();
            leader.quack();
            leader.quack();
            System.out.println("===");
        }
        for (int i = 1; i < quackables.size(); i++) {
            quackables.get(i).quack();
            System.out.println("===");
        }
    }
}
