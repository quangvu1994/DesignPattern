package Decorator;

/**
 * Created by Quang on 11/8/15.
 */

/**
 * @desc provides a template/contract for all types of pizza
 * Contains two simple functions: get the pizza's description and its cost
 */
public interface Pizza {
    public String getDescription();
    public double getCost();
}
