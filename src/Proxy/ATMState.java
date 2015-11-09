package Proxy;

/**
 * Created by Quang on 11/8/15.
 */
public interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);

}