package Proxy;

/**
 * Created by Quang on 11/8/15.
 */
public class ATMProxy implements GetATMData{

    @Override
    public ATMState getATMState() {
        ATMMachine realMachine = new ATMMachine();
        return realMachine.getATMState();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realMachine = new ATMMachine();
        return realMachine.getCashInMachine();
    }
}
