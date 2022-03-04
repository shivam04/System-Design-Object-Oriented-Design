/**
 * Created by shivam.si on 04/03/22 9:37 am
 */

class ATMOperator extends User{
    constructor(id, name, email, phone, status, atm) {
        super(id, name, email, phone, status);
        this._atm = atm;
    }
    get atm() {
        return this._atm;
    }

    set atm(value) {
        this._atm = value;
    }

    addBill(bill, quantity) {
        this.atm.addCash(bill, quantity);
    }

    addMultipleBills(bills) {
        for(let bill in bills) {
            this.atm.addCash(bill, bills[bill]);
        }
    }
}