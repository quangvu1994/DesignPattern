package Decorator;

/**
 * Created by Quang on 11/8/15.
 */
public class PizzaMaker {
    public static void main(String[] args){
        Pizza basicPizza = new Mozzarella(new PlainPizza());

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

    }

}
