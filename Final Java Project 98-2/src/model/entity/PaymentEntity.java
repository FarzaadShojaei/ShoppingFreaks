package model.entity;



public class PaymentEntity {
    private String Name, PhoneNumber, MeliCode;
    private String cardNumber;
    private String totalPrice;

    public String getName() {
        return Name;
    }

    public PaymentEntity setName(String name) {
        Name = name;
        return this;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public PaymentEntity setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
        return this;
    }

    public String getMeliCode() {
        return MeliCode;
    }

    public PaymentEntity setMeliCode(String meliCode) {
        MeliCode = meliCode;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public PaymentEntity setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public PaymentEntity setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
}
