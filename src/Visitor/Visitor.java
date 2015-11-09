package Visitor;

/**
 * Created by Quang on 11/9/15.
 */
public interface Visitor {
    public double visit(Liquor liquorItem);
    public double visit(Tobacco tobaccoItem);
    public double visit(Necessity necessityItem);
}
