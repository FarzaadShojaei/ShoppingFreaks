package controller;
import java.util.*;

import model.entity.UserEntity;
import model.service.Service;

public class Controller {
    public void editor(String name, String PhoneNumber, String Address, String MeliCode, UserEntity temp){
        try{
            Service.getInstance().save(new UserEntity().setName(temp.getName()).setPhoneNumber(temp.getPhoneNumber())
            .setAddress(temp.getAddress()).setMeliCode(temp.getMeliCode()));
        }catch (Exception e){
            System.out.println("Failed to save"+e.getMessage());
        }
    }
    public void reporter(){
        List<UserEntity> userEntityList =null;
        try{
            Service.getInstance().report();
        }catch (Exception e){
            System.out.println("failed to report"+e.getMessage());
        }
        for(UserEntity userEntity : userEntityList){
            System.out.println(userEntity.getName());
            System.out.println(userEntity.getPhoneNumber());
            System.out.println(userEntity.getAddress());
            System.out.println(userEntity.getMeliCode());
        }
    }
}
