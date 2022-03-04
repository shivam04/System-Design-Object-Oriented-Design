/**
 * Created by shivam.si on 04/03/22 8:39 am
 */

class Address {
    constructor(streetAddress, city, state, country, zipcode) {
        this._streetAddress = streetAddress;
        this._city = city;
        this._state = state;
        this._country = country;
        this._zipcode = zipcode;
    }


    get streetAddress() {
        return this._streetAddress;
    }

    set streetAddress(value) {
        this._streetAddress = value;
    }

    get city() {
        return this._city;
    }

    set city(value) {
        this._city = value;
    }

    get state() {
        return this._state;
    }

    set state(value) {
        this._state = value;
    }

    get country() {
        return this._country;
    }

    set country(value) {
        this._country = value;
    }

    get zipcode() {
        return this._zipcode;
    }

    set zipcode(value) {
        this._zipcode = value;
    }
}