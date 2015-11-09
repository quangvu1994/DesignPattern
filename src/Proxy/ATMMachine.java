package Proxy;

/**
 * Created by Quang on 11/8/15.
 */
public class ATMMachine implements GetATMData{
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;
    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }

    public ATMState getATMState() { return atmState; }
    public int getCashInMachine() { return cashInMachine; }
}