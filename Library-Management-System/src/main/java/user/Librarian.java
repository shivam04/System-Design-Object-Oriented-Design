package user;

import common.AccountSatus;

/**
 * Created by shivam.si on 10/02/21 5:34 pm
 */
public class Librarian extends Account{
    public boolean blockMember(Member member) {
        member.setStatus(AccountSatus.BLACKLISTED);
        return true;
    }

    public boolean unBlockMember(Member member) {
        member.setStatus(AccountSatus.ACTIVE);
        return true;
    }

    public boolean cancelMembership(Member member) {
        member.setStatus(AccountSatus.CLOSED);
        return true;
    }
}
