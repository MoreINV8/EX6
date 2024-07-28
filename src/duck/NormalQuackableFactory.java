package duck;

/**
 * @author 6510450305 chaiyapat
 */

public class NormalQuackableFactory implements QuackableFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdaptor(new Goose());
    }

    @Override
    public Quackable createPigeon() {
        return new PigeonAdapter(new Pigeon());
    }
}
