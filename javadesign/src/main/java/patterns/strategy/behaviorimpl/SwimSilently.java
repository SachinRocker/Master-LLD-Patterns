package patterns.strategy.behaviorimpl;

import patterns.strategy.behaviors.SwimBehavior;

public class SwimSilently implements SwimBehavior {
    public void swim() {
        System.out.println("Swim Silently");

    }
}
