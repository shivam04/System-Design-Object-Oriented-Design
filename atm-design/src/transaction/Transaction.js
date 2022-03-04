/**
 * Created by shivam.si on 04/03/22 8:45 am
 */
//Abstract Class
class Transaction {
    constructor(transactionId, createdAt, status) {
        this._transactionId = transactionId;
        this._createdAt = createdAt;
        this._status = status;
        if(this.constructor === Transaction) {
            throw new Error(" Object of Transaction Class cannot be created");
        }
    }

    get transactionId() {
        return this._transactionId;
    }

    set transactionId(value) {
        this._transactionId = value;
    }

    get createdAt() {
        return this._createdAt;
    }

    set createdAt(value) {
        this._createdAt = value;
    }

    get status() {
        return this._status;
    }

    set status(value) {
        this._status = value;
    }

    makeTransaction() {
        throw new Error("Abstract Method makeTransaction has no implementation");
    }
}