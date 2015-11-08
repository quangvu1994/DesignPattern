package Decorator;

/**
 * Created by Quang on 11/8/15.
 */

/**
 * @desc concrete decorator inherits the behavior from the decorator class
 * and implements the functionalities of the pizza interface
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