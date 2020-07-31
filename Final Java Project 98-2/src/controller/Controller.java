package controller;

import java.util.*;

import model.entity.CommentEntity;
import model.entity.PaymentEntity;
import model.entity.ProductEntity;
import model.entity.UserEntity;
import model.repository.Repository;
import model.service.Service;
import view.Cart;

import javax.jws.soap.SOAPBinding;


public class Controller {
    Scanner input = new Scanner(System.in);

    /////////////////////////////////////////////////////////////////
    public void initNumberOfProducts() {
        try {
            Service.getInstance().initialization(new ProductEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /////////////////////////////////////////////////////////////////
    public void insertUserInfo(String name, String phoneNumber, String address, String meliCode) throws Exception {
        Service.getInstance().save(UserEntity.userEntity.setName(name).setPhoneNumber(phoneNumber)
                .setAddress(address).setMeliCode(meliCode));
    }

    /////////////////////////////////////////////////////////////////
    public void insertPayments(String cardNumber, String totalPrice) throws Exception {
        Service.getInstance().savePayment(UserEntity.userEntity.setCardNumber(cardNumber).setTotalPrice(totalPrice));
    }

    /////////////////////////////////////////////////////////////////
    public void insertComments(String comment) throws Exception {
        Service.getInstance().savecomment(new CommentEntity().setComment(comment));
    }

    /////////////////////////////////////////////////////////////////
    public void insertDocuments(String cardNumber, String totalPrice) throws Exception {
            Service.getInstance().saveDocuments(UserEntity.userEntity.setCardNumber(cardNumber).setTotalPrice(totalPrice));
    }

    /////////////////////////////////////////////////////////////////
    public String priceReporter(String name) {
        String price = "";
        try {
            price = Service.getInstance().reportPrice(name);
        } catch (Exception e) {
            System.out.println("Failed to get price . Error : " + e.getMessage());
        }
        return price;
    }

    /////////////////////////////////////////////////////////////////
    public int numberReporter(String name) {
        int number = 0;
        try {
            number = Service.getInstance().reportNumbers(name);
        } catch (Exception e) {
            System.out.println("Failed to get price . Error : " + e.getMessage());
        }
        return number;
    }

    /////////////////////////////////////////////////////////////////
    public void removeProducts() {
        try {
            Service.getInstance().removeProducts();
        } catch (Exception e) {
            System.out.println("Failed to delete from products . Error : " + e.getMessage());
        }
    }

    /////////////////////////////////////////////////////////////////
    public void updateProducts(String productName) {
        try {
            Service.getInstance().editNOProducts(new ProductEntity(), productName);
        } catch (Exception e) {
            System.out.println("Failed to update number of products . Error : " + e.getMessage());
        }
    }
}