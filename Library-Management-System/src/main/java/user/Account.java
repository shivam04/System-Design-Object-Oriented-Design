package user;

import common.AccountSatus;

/**
 * Created by shivam.si on 10/02/21 5:31 pm
 */
public abstract class Account {
    private String accountId;
    private String password;
    private AccountSatus status;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountSatus getStatus() {
        return status;
    }

    public void setStatus(AccountSatus status) {
        this.status = status;
    }

    public boolean resetPassword() {
        return true;
    }
}
