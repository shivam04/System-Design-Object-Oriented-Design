/**
 * Created by shivam.si on 04/03/22 9:29 am
 */

class User {
    constructor(id, name, email, phone, status) {
        this._id = id;
        this._name = name;
        this._email = email;
        this._phone = phone;
        this._status = status;
        if(this.constructor === User) {
            throw new Error(" Object of Transaction Class cannot be created");
        }
    }


    get id() {
        return this._id;
    }

    set id(value) {
        this._id = value;
    }

    get name() {
        return this._name;
    }

    set name(value) {
        this._name = value;
    }

    get email() {
        return this._email;
    }

    set email(value) {
        this._email = value;
    }

    get phone() {
        return this._phone;
    }

    set phone(value) {
        this._phone = value;
    }

    get status() {
        return this._status;
    }

    set status(value) {
        this._status = value;
    }
}