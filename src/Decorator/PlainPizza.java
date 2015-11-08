package Decorator;

/**
 * Created by Quang on 11/8/15.
 */

/**
 * @desc a type of pizza that implements two simple functions of the pizza interface:
 * get the description and get the cost
 */
public class PlainPizza implements Pizza {

    /**
     * @desc get the description for this type of pizza
     * @param none
     * @return String - its description
     */
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    /**
     * @desc get the cost of this type of pizza
     * @param none
     * @return double - cost of this pizza
     */
    @Override
    public double getCost() {
        return 4.00;
    }
}
