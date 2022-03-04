/**
 * Created by shivam.si on 04/03/22 8:16 am
 */

class Account {
    constructor(totalBalance, availableBalance, accountNumber, withdrawalLimit) {
        this._totalBalance = totalBalance;
        this._availableBalance = availableBalance;
        this._accountNumber = accountNumber;
        this._withdrawalLimit = withdrawalLimit;
    }

    get totalBalance() {
        return this._totalBalance;
    }

    set totalBalance(value) {
        this._totalBalance = value;
    }

    get availableBalance() {
        return this._availableBalance;
    }

    set availableBalance(value) {
        this._availableBalance = value;
    }

    get accountNumber() {
        return this._accountNumber;
    }

    set accountNumber(value) {
        this._accountNumber = value;
    }

    get withdrawalLimit() {
        return this._withdrawalLimit;
    }

    set withdrawalLimit(value) {
        this._withdrawalLimit = value;
    }
}