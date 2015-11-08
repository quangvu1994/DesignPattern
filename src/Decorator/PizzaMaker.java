package Decorator;

/**
 * Created by Quang on 11/8/15.
 */

/**
 * @desc: Creates a pizza and adds the topping dynamically
 *          prints out its description and its cost
 */
public class PizzaMaker {
    public static void main(String[] args){
        // Easily modify the Pizza object by adding the topping dynamically
        Pizza basicPizza = new Mozzarella(new PlainPizza());

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

    }

}
