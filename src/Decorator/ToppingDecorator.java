package Decorator;

/**
 * Created by Quang on 11/8/15.
 */

/**
 * @desc decorator class implements the Pizza interface and provides a skeleton constructor
 * for all of its concrete decorators
 */
abstract class ToppingDecorator implements Pizza{
    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){
        tempPizza = newPizza;
    }

    public String getDescription(){
        return tempPizza.getDescription();
    }

    public double getCost(){
        return tempPizza.getCost();
    }
}
