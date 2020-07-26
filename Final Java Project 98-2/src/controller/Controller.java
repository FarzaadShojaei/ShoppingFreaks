package controller;
import java.util.*;

import model.entity.CommentEntity;
import model.entity.PaymentEntity;
import model.entity.ProductEntity;
import model.entity.UserEntity;
import model.repository.Repository;
import model.service.Service;


public class Controller {
    Scanner input=new Scanner(System.in);

    public void insertUserInfo(String name, String phoneNumber, String address, String meliCode){
        try{
            Service.getInstance().save(new UserEntity().setName(name).setPhoneNumber(phoneNumber)
                    .setAddress(address).setMeliCode(meliCode));
        }catch (Exception e){
            System.out.println("Failed to save . Error : "+e.getMessage());
        }
    }
    /////////////////////////////////////////////////////////////////
    public void insertPayments(PaymentEntity name){
        try{
            Service.getInstance().savePayment(new PaymentEntity().setDate(name.getDate()).setHour(name.getHour()).setCardNumber(name.getCardNumber()).setPrice(name.getPrice()));
        }catch (Exception e){
            System.out.println("Failed to save . Error : "+e.getMessage());
        }
    }
    //////////////////////////////////////////////////////////////////////
    public void insertComments(String comment){
        try{
            Service.getInstance().savecomment(new CommentEntity().setComment(comment));
        }catch (Exception e){
            System.out.println("Failed to save . Error : "+e.getMessage());
        }
    }
    ////////////////////////////////////////////////////////////////////////////////
    public void reporter(){
        List<UserEntity> userEntityList =null;
        try{
            Service.getInstance().report();
        }catch (Exception e){
            System.out.println("Failed to report . Error : "+e.getMessage());
        }
        for(UserEntity userEntity : userEntityList){
            System.out.println(userEntity.getName());
            System.out.println(userEntity.getPhoneNumber());
            System.out.println(userEntity.getAddress());
            System.out.println(userEntity.getMeliCode());
        }
    }
    ///////////////////////////////////////////////////////
    public void productreporter(){
        List<ProductEntity> productEntityList=null;
        try{
            Service.getInstance().reportproduct();
        }catch (Exception e){
            System.out.println("Failed to report . Error : "+e.getMessage());
        }
        for(ProductEntity productEntity:productEntityList){
            System.out.println(productEntity.getNumberOfTankTop());
            System.out.println(productEntity.getNumberOfJeans());
            System.out.println(productEntity.getNumberOfShirt());
            System.out.println(productEntity.getNumberOfPizza());
            System.out.println(productEntity.getNumberOfHotDog());
            System.out.println(productEntity.getNumberOfTurkishKebab());
            System.out.println(productEntity.getNumberOfLittlePrince());
            System.out.println(productEntity.getNumberOfWarAndPeace());
            System.out.println(productEntity.getNumberOfMetro2034());
            System.out.println(productEntity.getNumberOfFork());
            System.out.println(productEntity.getNumberOfOven());
            System.out.println(productEntity.getNumberOfPlate());
            System.out.println(productEntity.getNumberOfTape());
            System.out.println(productEntity.getNumberOfAxe());
            System.out.println(productEntity.getNumberOfBat());
        }
    }
    /////////////////////////////////////////////////////////////////
    public void paymentreporter(){
        List<PaymentEntity>paymentEntityList=null;
        try{
            Service.getInstance().reportpayment();
        }catch (Exception e){
            System.out.println("Failed to report . Error : "+e.getMessage());
        }
        for(PaymentEntity paymentEntity : paymentEntityList){
            System.out.println(paymentEntity.getDate());
            System.out.println(paymentEntity.getHour());
            System.out.println(paymentEntity.getCardNumber());
            System.out.println(paymentEntity.getPrice());
        }
    }
    ////////////////////////////////////////////////////////////////////
    public void commentreporter(){
        List<CommentEntity>commentEntityList=null;
        try{
            Service.getInstance().reportcomment();
        }catch (Exception e){
            System.out.println("Failed to report . Error : "+e.getMessage());
        }
        for(CommentEntity commentEntity:commentEntityList){
            System.out.println(commentEntity.getComment());
        }
    }
    /////////////////////////////////////////////////////////
}