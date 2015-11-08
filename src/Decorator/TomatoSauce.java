package Decorator;

/**
 * Created by Quang on 11/8/15.
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }


    public String getDescription(){
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost(){
        return tempPizza.getCost() + .35;
    }
}