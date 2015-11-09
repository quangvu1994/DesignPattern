package Mediator;

/**
 * Created by Quang on 11/8/15.
 */
public interface Mediator {

    public void saleOffer(String stock, int shares, int collCode);

    public void buyOffer(String stock, int shares, int collCode);

    public void addColleague(Colleague colleague);

}