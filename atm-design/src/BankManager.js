/**
 * Created by shivam.si on 04/03/22 9:27 am
 */

class BankManager extends User{
    constructor(id, name, email, phone, status) {
        super(id, name, email, phone, status);
    }

    checkAvailableBalance(atm) {
        atm.getAvailableBalance();
    }
}