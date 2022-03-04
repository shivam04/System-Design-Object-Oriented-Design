/**
 * Created by shivam.si on 04/03/22 9:00 am
 */

class BalanceInquiry extends Transaction {
    constructor(transactionId, createdAt, status, accountId) {
        super(transactionId, createdAt, status);
        this._accountId = accountId;
    }

    get accountId() {
        return this._accountId;
    }

    set accountId(value) {
        this._accountId = value;
    }

    getAmount() {

    }

    makeTransaction() {
        //some db operation
    }

}