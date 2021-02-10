package user;

import constants.AccountStatus;

/**
 * Created by shivam.si on 19/01/21 12:13 pm
 */
public abstract class Account {
    private String id;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword() {
        //logic
        return true;
    }
}
