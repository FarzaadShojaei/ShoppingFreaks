package model.entity;

import java.util.Date;

public class UserEntity {
    private String Name, PhoneNumber, Address, MeliCode;//Baraye vared shodan user
    private String cardNumber;
    private String totalPrice;
    private Date date;


    /////////////////////////////////////////////////// getters
    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public String getMeliCode() {
        return MeliCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public Date getDate() {
        return date;
    }

    /////////////////////////////////////////////////// setters
    public UserEntity setName(String name) {
        Name = name;
        return this;
    }

    public UserEntity setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
        return this;
    }

    public UserEntity setAddress(String address) {
        Address = address;
        return this;
    }

    public UserEntity setMeliCode(String meliCode) {
        MeliCode = meliCode;
        return this;
    }

    public UserEntity setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public UserEntity setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public UserEntity setDate(Date date) {
        this.date = date;
        return this;
    }
}
