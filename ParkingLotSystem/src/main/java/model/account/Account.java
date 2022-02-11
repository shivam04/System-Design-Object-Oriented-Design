package model.account;

import model.ParkingLot;
import model.constants.AccountStatus;
import model.constants.Person;

/**
 * Created by shivam.si on 10/02/22 4:26 pm
 */

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;
    protected ParkingLot parkingLot;

    public boolean resetPassword() {
        //logic
        return true;
    }
}
