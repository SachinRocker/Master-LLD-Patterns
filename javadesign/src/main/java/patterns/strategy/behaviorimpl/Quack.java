package patterns.strategy.behaviorimpl;

import patterns.strategy.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {

        System.out.println("Perform Quack");
    }
}
