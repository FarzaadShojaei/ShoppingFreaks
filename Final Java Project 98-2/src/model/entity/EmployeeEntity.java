package model.entity;

public class EmployeeEntity {
    private String name;
    private String fathername;
    private int  Age;
    private String PhoneNumber;


//////////////////////////////////////


    public String getName() { return name; }
    public String getFathername() { return fathername; }
    public int getAge() { return Age; }
    public String getPhoneNumber() { return PhoneNumber; }

    //////////////////////////////////////////////////////////////


    public EmployeeEntity setName(String name) { return this; }
    public EmployeeEntity setFathername(String fathername) { this.fathername = fathername;return this; }
    public EmployeeEntity setAge(int age) { Age = age;return this; }
    public EmployeeEntity setPhoneNumber(String phoneNumber) { PhoneNumber = phoneNumber;return this; }
}
