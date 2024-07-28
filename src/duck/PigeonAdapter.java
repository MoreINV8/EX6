package duck;

/**
 * @author 6510450305 chaiyapat
 */

public class PigeonAdapter implements Quackable{
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
