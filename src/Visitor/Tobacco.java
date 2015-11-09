package Visitor;

/**
 * Created by Quang on 11/9/15.
 */
public class Tobacco implements Visitable {
    private double price;

    Tobacco(double item){
        price = item;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
