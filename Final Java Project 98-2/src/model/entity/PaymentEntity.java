package model.entity;

public class PaymentEntity {
    private String Date;
    private int hour;
    private String CardNumber;
    private String Price;
    public String getPrice() { return Price; }
//////////////////////////////////////////////////////////////
    public String getDate() { return Date; }

    public int getHour() { return hour; }

    public String getCardNumber() { return CardNumber; }
//////////////////////////////////////////////////////////////////
    public PaymentEntity setDate(String date) { Date = date;return this; }

    public PaymentEntity setHour(int hour) { this.hour = hour;return this; }

    public PaymentEntity setCardNumber(String cardNumber) { CardNumber = cardNumber;return this; }

    public PaymentEntity setPrice(String price) { Price = price;return this; }



}
