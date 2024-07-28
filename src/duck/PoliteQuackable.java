package duck;

/**
 * @author 6510450305 chaiyapat
 */

public class PoliteQuackable implements Quackable{
    private Quackable quackable;

    public PoliteQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        System.out.println("krub");
    }
}
