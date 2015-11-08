package Decorator;

/**
 * Created by Quang on 11/8/15.
 */

/**
 * @desc concrete decorator inherits the behavior from the decorator class
 * and implements the functionalities of the pizza interface
 */
public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Pepperoni");
    }


    public String getDescription(){
        return tempPizza.getDescription() + ", Pepperoni";
    }

    public double getCost(){
        return tempPizza.getCost() + 1.00;
    }
}
