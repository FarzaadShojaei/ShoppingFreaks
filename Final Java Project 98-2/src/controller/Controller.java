package controller;
import java.util.*;

import model.entity.Entity;
import model.service.Service;

public class Controller {
    public void editor(String name,String PhoneNumber,String Address,String MeliCode,Entity temp){
        try{
            Service.getInstance().save(new Entity().setName(temp.getName()).setPhoneNumber(temp.getPhoneNumber())
            .setAddress(temp.getAddress()).setMeliCode(temp.getMeliCode()));
        }catch (Exception e){
            System.out.println("Failed to save"+e.getMessage());
        }
    }
    public void reporter(){
        List<Entity> entityList=null;
        try{
            Service.getInstance().report();
        }catch (Exception e){
            System.out.println("failed to report"+e.getMessage());
        }
        for(Entity entity: entityList){
            System.out.println(entity.getName());
            System.out.println(entity.getPhoneNumber());
            System.out.println(entity.getAddress());
            System.out.println(entity.getMeliCode());
        }
    }
}
