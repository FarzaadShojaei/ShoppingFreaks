package model.entity;

public class Entity {
    private String Name,PhoneNumber,Address,MeliCode;//Baraye vared shodan user
    public String getName(){return Name;}
    public String getPhoneNumber(){return PhoneNumber;}
    public String getAddress(){return  Address;}
    public String getMeliCode(){return MeliCode;}

    public Entity setName(String name) {
        Name = name;
        return this;
    }

    public Entity setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
        return this;
    }

    public Entity setAddress(String address) {
        Address = address;
        return this;
    }

    public Entity setMeliCode(String meliCode) {
        MeliCode = meliCode;
        return this;
    }
}
