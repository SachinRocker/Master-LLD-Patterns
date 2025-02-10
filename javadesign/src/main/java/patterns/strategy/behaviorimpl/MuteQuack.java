package patterns.strategy.behaviorimpl;

import patterns.strategy.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Mute Quack");
    }
}
