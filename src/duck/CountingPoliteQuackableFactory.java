package duck;

/**
 * @author 6510450305 chaiyapat
 */

public class CountingPoliteQuackableFactory implements QuackableFactory{
    @Override
    public Quackable createMallardDuck() {
        return new PoliteQuackable(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new PoliteQuackable(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new PoliteQuackable(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteQuackable(new QuackCounter(new RubberDuck()));
    }

    @Override
    public Quackable createGoose() {
        return new PoliteQuackable(new QuackCounter(new GooseAdaptor(new Goose())));
    }

    @Override
    public Quackable createPigeon() {
        return new PoliteQuackable(new QuackCounter(new PigeonAdapter(new Pigeon())));
    }
}
