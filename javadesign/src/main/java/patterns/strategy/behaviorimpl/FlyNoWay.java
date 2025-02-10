package patterns.strategy.behaviorimpl;


import patterns.strategy.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Fly No Way");
    }
}
