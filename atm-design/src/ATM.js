/**
 * Created by shivam.si on 04/03/22 8:42 am
 */

class ATM {
    constructor(id, address, keypad, screen, cashDispenser, cardReader, availableCash) {
        this._id = id;
        this._address = address;
        this._keypad = keypad;
        this._screen = screen;
        this._cashDispenser = cashDispenser;
        this._cardReader = cardReader;
        this._availableCash = {}.concat(...availableCash)
        this._availableCash = availableCash; //just for cash
    }


    get id() {
        return this._id;
    }

    set id(value) {
        this._id = value;
    }

    get address() {
        return this._address;
    }

    set address(value) {
        this._address = value;
    }

    get keypad() {
        return this._keypad;
    }

    set keypad(value) {
        this._keypad = value;
    }

    get screen() {
        return this._screen;
    }

    set screen(value) {
        this._screen = value;
    }

    get cashDispenser() {
        return this._cashDispenser;
    }

    set cashDispenser(value) {
        this._cashDispenser = value;
    }

    get cardReader() {
        return this._cardReader;
    }

    set cardReader(value) {
        this._cardReader = value;
    }

    get availableCash() {
        return this._availableCash;
    }

    set availableCash(value) {
        this._availableCash = value;
    }

    authenticateUser(account) {

    }

    getAvailableBalance() {
        let sum = 0;
        for (let bill in this.availableCash) {
            sum += this.availableCash[bill];
        }
        return sum;
    }

    addCash(bill, quantity) {
        if(this.availableCash.hasOwnProperty(bill))
            this.availableCash[bill] += quantity;
        else
            this.availableCash[bill] = quantity;
    }
}