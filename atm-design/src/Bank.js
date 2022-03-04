/**
 * Created by shivam.si on 04/03/22 8:38 am
 */

class Bank {
    constructor(name, bankCode, atms) {
        this._name = name;
        this._bankCode = bankCode;
        this._atms = [].concat(...atms); //just for reference
    }


    get name() {
        return this._name;
    }

    set name(value) {
        this._name = value;
    }

    get bankCode() {
        return this._bankCode;
    }

    set bankCode(value) {
        this._bankCode = value;
    }


    get atms() {
        return this._atms;
    }

    set atms(value) {
        this._atms = value;
    }

    addATM(atm) {
        this.atms.push(atm);
    }
}