/**
 * Created by shivam.si on 04/03/22 9:01 am
 */

class Withdraw extends Transaction {

    constructor(transactionId, createdAt, status, amount) {
        super(transactionId, createdAt, status);
        this._transactionId = transactionId;
        this._createdAt = createdAt;
        this._status = status;
        this._amount = amount;
    }
    get amount() {
        return this._amount;
    }

    set amount(value) {
        this._amount = value;
    }

    makeTransaction() {
        //some db operation
    }
}