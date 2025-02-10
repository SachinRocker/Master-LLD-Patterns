package patterns.strategy;

import patterns.strategy.behaviorimpl.FlyNoWay;
import patterns.strategy.behaviorimpl.FlyWithWings;
import patterns.strategy.behaviorimpl.MuteQuack;
import patterns.strategy.behaviorimpl.Quack;
import patterns.strategy.constant.DuckTypes;


public class DuckSimulator {
    private static DuckSimulator duckSimulator;
     private Duck getRubberDuck(){
         Duck rubberDuck =  new RubberDuck();
         rubberDuck.setFlyBehavior(new FlyNoWay());
         rubberDuck.setQuackBehavior(new Quack());
         return rubberDuck;
     }

     private Duck getMallardDuck(){
         Duck mallardDuck =  new MallardDuck();
         mallardDuck.setFlyBehavior(new FlyWithWings());
         mallardDuck.setQuackBehavior(new MuteQuack());
         return mallardDuck;
     }

    /**
     *
     * @param duckType an enum
     * @return DuckType a simple factory implementation
     */

     public Duck getDuck(DuckTypes duckType){
        return switch (duckType){
             case RUBBER_DUCK -> getRubberDuck();
             case MALLARD_DUCK -> getMallardDuck();
         };
     }

     public void engageRubberDuck(){
         System.out.println("Engaging Rubber Duck");
         var rubberDuck = (RubberDuck) duckSimulator.getDuck(DuckTypes.RUBBER_DUCK);
         rubberDuck.performFly();
         rubberDuck.performQuack();
         rubberDuck.performSwim();
         rubberDuck.performSqueeze(); // as rubber duck has this additional capability
     }

    public void engageMallardDuck(){
         System.out.println("Engaging Mallard Duck");
        var rubberDuck = duckSimulator.getDuck(DuckTypes.MALLARD_DUCK);
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
    }




    public static void main(String[] args) {
       duckSimulator = new DuckSimulator();
       duckSimulator.engageRubberDuck();
       duckSimulator.engageMallardDuck();





    }
}
