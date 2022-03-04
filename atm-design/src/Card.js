/**
 * Created by shivam.si on 04/03/22 8:36 am
 */

class Card {
    constructor(number, customerName, expiry, pin) {
        this._number = number;
        this._customerName = customerName;
        this._expiry = expiry;
        this._pin = pin;
    }

    get number() {
        return this._number;
    }

    set number(value) {
        this._number = value;
    }

    get customerName() {
        return this._customerName;
    }

    set customerName(value) {
        this._customerName = value;
    }

    get expiry() {
        return this._expiry;
    }

    set expiry(value) {
        this._expiry = value;
    }

    get pin() {
        return this._pin;
    }

    set pin(value) {
        this._pin = value;
    }
}