package duck;

/**
 * @author 6510450305 chaiyapat
 */

public class CountingQuackableFactory implements QuackableFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGoose() {
        return new QuackCounter(new GooseAdaptor(new Goose()));
    }

    @Override
    public Quackable createPigeon() {
        return new QuackCounter(new PigeonAdapter(new Pigeon()));
    }
}
