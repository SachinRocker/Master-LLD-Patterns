package patterns.strategy;


public class RubberDuck extends Duck{
    public RubberDuck(){

    }

    /**
     * As a rubber duck has the capability of regenerating back to its original shape after squeezing
     */
    public void performSqueeze(){
        System.out.println(" Re-generating the duck after squeezing");
    }

}
