import duck.*;

/**
 * from observed the patterns
 * Adaptor pattern have an object with data type difference to own implement class
 * Decorator pattern have an object with the same data type to implement class
 *
 * @author 6510450305 chaiyapat
 */

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        QuackableFactory factory = new CountingPoliteQuackableFactory();
        simulator.simulate(factory);
    }

    private void simulate(QuackableFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdaptor(new Goose());
        Quackable pigeon = factory.createPigeon();

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redheadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);
        flock2.add(goose);
        flock2.add(pigeon);

        System.out.println( "\nDuck Simulator");

        simulate(flock1);
        simulate(flock2);

        System.out.println("Total duck: " + QuackCounter.getQuackCount());
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
