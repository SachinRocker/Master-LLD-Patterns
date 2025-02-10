package patterns.strategy;


import patterns.strategy.behaviorimpl.SwimSilently;
import patterns.strategy.behaviors.FlyBehavior;
import patterns.strategy.behaviors.QuackBehavior;
import patterns.strategy.behaviors.SwimBehavior;

/**
 * Here we are using Has-A relationship as each duck has a fly, quack and swim behaviour
 * that means and we are setting these behaviors differently for each implementation.
 *
 * We are using composition instead of inheritance such that each duck can define their behavior that are dynamic to each
 * of them.
 * Each behavior is a set of algorithms i.e can have multiple implementations that can be defined for multiple use cases and
 * won't affect the DUCK class
 *
 * Strategy Patterns is such that all the behaviors are encapsulated and can have multiple implementations that makes them
 * interchangeable and modifiable without affecting the actual functionality
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private SwimBehavior swimBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    protected void performFly(){
        flyBehavior.fly();
    }

    protected void performQuack(){
        quackBehavior.quack();
    }

    void performSwim() {
        // as all ducks swim silently we are propagating this as default behavior
        setSwimBehavior();
        swimBehavior.swim();
    }

    public void setSwimBehavior(){
        this.swimBehavior  = new SwimSilently();
    }

}
