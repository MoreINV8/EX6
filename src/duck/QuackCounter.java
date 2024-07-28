package duck;

/**
 * @author 6510450305 chaiyapat
 */

public class QuackCounter implements Quackable{
    private Quackable quackable;
    private boolean isQuack;
    private static int quackCount;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
        this.isQuack = false;
    }

    public static int getQuackCount() {
        return quackCount;
    }

    @Override
    public void quack() {
        quackable.quack();
        if (!isQuack) {
            quackCount++;
            isQuack = true;
        }
    }
}
