package model.entity;

public class Entity {
    private String Name,PhoneNumber,Address,MeliCode;//Baraye vared shodan user
    private int id;
    private int number;





    public int getNumber() { return number; }
    public int getId() { return id; }
    public String getName(){return Name;}
    public String getPhoneNumber(){return PhoneNumber;}
    public String getAddress(){return  Address;}
    public String getMeliCode(){return MeliCode;}

    public Entity setNumber(int number) { this.number = number;return this; }


    public Entity setId(int id) { this.id = id;return this; }



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
