package Decorator;

/**
 * Created by Quang on 11/8/15.
 */
public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
