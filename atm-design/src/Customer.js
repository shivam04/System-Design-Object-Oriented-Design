/**
 * Created by shivam.si on 04/03/22 8:34 am
 */
class Customer extends User{

    constructor(id, name, email, phone, address, status, card, account) {
        super(id, name, email, phone, status);
        this._address = address;
        this._card = card;
        this._account = account;
    }

    get address() {
        return this._address;
    }

    set address(value) {
        this._address = value;
    }

    get card() {
        return this._card;
    }

    set card(value) {
        this._card = value;
    }

    get account() {
        return this._account;
    }

    set account(value) {
        this._account = value;
    }

    makeTransaction(transaction) {
        transaction.makeTransaction();
    }
}