package model.repository;

import model.entity.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "digikala", "myjava123");
        connection.setAutoCommit(false);
    }



    public List<UserEntity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<UserEntity> userEntityList = new ArrayList<>();
        while (resultSet.next()) {
            UserEntity userEntity = new UserEntity();
            userEntity.setMeliCode(resultSet.getString("melicode"));
            userEntity.setName(resultSet.getString("Name"));
            userEntity.setPhoneNumber(resultSet.getString("PhoneNumber"));
            userEntity.setAddress(resultSet.getString("Address"));
            userEntityList.add(userEntity);
        }

        if (resultSet.next()) {
            System.out.println("You May Enter");
        } else {
            System.out.println("you Cannot Enter");
            System.exit(0);
        }
        return userEntityList;

    }
    ////////////////////////////////////////////////////////////////////
    public List<ProductEntity> selectproducts()throws Exception{
        preparedStatement=connection.prepareStatement("select * from products");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<ProductEntity> productEntityList=new ArrayList<>();
        while(resultSet.next()){
            ProductEntity productEntity=new ProductEntity();
            productEntity.setNumberOfTankTop(resultSet.getInt(2));
            productEntity.setNumberOfJeans(resultSet.getInt(2));
            productEntity.setNumberOfShirt(resultSet.getInt(2));
                productEntity.setNumberOfPizza(resultSet.getInt(2));
            productEntity.setNumberOfHotDog(resultSet.getInt(2));
            productEntity.setNumberOfTurkishKebab(resultSet.getInt(2));
            productEntity.setNumberOfLittlePrince(resultSet.getInt(2));
            productEntity.setNumberOfWarAndPeace(resultSet.getInt(2));
            productEntity.setNumberOfMetro2034(resultSet.getInt(2));
            productEntity.setNumberOfFork(resultSet.getInt(2));
            productEntity.setNumberOfOven(resultSet.getInt(2));
            productEntity.setNumberOfPlate(resultSet.getInt(2));
            productEntity.setNumberOfAxe(resultSet.getInt(2));
            productEntity.setNumberOfTape(resultSet.getInt(2));
            productEntity.setNumberOfBat(resultSet.getInt(2));
            productEntityList.add(productEntity);

        }
        return productEntityList;
    }
////////////////////////////////////////////////////////////////////////////////////
    public List<EmployeeEntity> selectemployees()throws Exception{
        preparedStatement=connection.prepareStatement("select * from Employees");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<EmployeeEntity> employeeEntityList=new ArrayList<>();
        while(resultSet.next()){
            EmployeeEntity employeeEntity=new EmployeeEntity();
            employeeEntity.setName(resultSet.getString("Name"));
            employeeEntity.setFathername(resultSet.getString("Fathername"));
            employeeEntity.setAge(resultSet.getInt("Age"));
            employeeEntity.setPhoneNumber(resultSet.getString("Phonenumber"));
            employeeEntityList.add(employeeEntity);
        }
        return employeeEntityList;
    }
/////////////////////////////////////////////////////////////////////////////////
    public void insertUserInfo(UserEntity userEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users(Melicode,Name,PhoneNumber,Address)values (?,?,?,?)");//primary key=Melicode
        preparedStatement.setString(1, userEntity.getMeliCode());
        preparedStatement.setString(2, userEntity.getName());
        preparedStatement.setString(3, userEntity.getPhoneNumber());
        preparedStatement.setString(4, userEntity.getAddress());
        preparedStatement.executeUpdate();
    }
/////////////////////////////////////////////////////////////////////////////////////
    public List<PaymentEntity> selectpayments()throws Exception{
        preparedStatement=connection.prepareStatement("select * from payments");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<PaymentEntity> paymentEntityList=new ArrayList<>();
        while(resultSet.next()){
            PaymentEntity paymentEntity=new PaymentEntity();
            paymentEntity.setDate(resultSet.getString("Date"));
            paymentEntity.setHour(resultSet.getInt("Hour"));
            paymentEntity.setCardNumber(resultSet.getString("Phonenumber"));
            paymentEntity.setPrice(resultSet.getString("Price"));
            paymentEntityList.add(paymentEntity);
        }
        return paymentEntityList;
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    public void insertProducts(ProductEntity productEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into products(Name , Price , numbers)values(?,?,?)");

        ////////////////////////////////////////////////////////////////////Clothes
        preparedStatement.setString(1, "TankTop");
        preparedStatement.setString(2, "10000");
        preparedStatement.setInt(3, productEntity.getNumberOfTankTop());

        preparedStatement.setString(1, "Jeans");
        preparedStatement.setString(2, "20000");
        preparedStatement.setInt(3, productEntity.getNumberOfJeans());

        preparedStatement.setString(1, "Shirt");
        preparedStatement.setString(2, "40000");
        preparedStatement.setInt(3, productEntity.getNumberOfShirt());
        ////////////////////////////////////////////////////////////////////Food
        preparedStatement.setString(1, "Pizza");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, productEntity.getNumberOfPizza());

        preparedStatement.setString(1, "HotDog");
        preparedStatement.setString(2, "60000");
        preparedStatement.setInt(3, productEntity.getNumberOfHotDog());

        preparedStatement.setString(1, "Turkish Kebab");
        preparedStatement.setString(2, "60000");
        preparedStatement.setInt(3, productEntity.getNumberOfTankTop());
        ////////////////////////////////////////////////////////////////////Books
        preparedStatement.setString(1, "Little Prince");
        preparedStatement.setString(2, "523000");
        preparedStatement.setInt(3, productEntity.getNumberOfLittlePrince());

        preparedStatement.setString(1, "War And Peace");
        preparedStatement.setString(2, "60075");
        preparedStatement.setInt(3, productEntity.getNumberOfWarAndPeace());

        preparedStatement.setString(1, "Metro 2034");
        preparedStatement.setString(2, "243200");
        preparedStatement.setInt(3, productEntity.getNumberOfMetro2034());
        ////////////////////////////////////////////////////////////////////Kitchen
        preparedStatement.setString(1, "Fork");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, productEntity.getNumberOfFork());

        preparedStatement.setString(1, "Oven");
        preparedStatement.setString(2, "70000");
        preparedStatement.setInt(3, productEntity.getNumberOfOven());

        preparedStatement.setString(1, "Plate");
        preparedStatement.setString(2, "600000");
        preparedStatement.setInt(3, productEntity.getNumberOfPlate());
        ////////////////////////////////////////////////////////////////////Tools
        preparedStatement.setString(1, "Tape");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, productEntity.getNumberOfTape());

        preparedStatement.setString(1, "Axe");
        preparedStatement.setString(2, "10000");
        preparedStatement.setInt(3, productEntity.getNumberOfAxe());

        preparedStatement.setString(1, "Bat");
        preparedStatement.setString(2, "700000");
        preparedStatement.setInt(3, productEntity.getNumberOfBat());

        preparedStatement.executeUpdate();
    }
/////////////////////////////////////////////////////////////////////////////////////////////
    public void updateNumberOfProduct (ProductEntity productEntity) throws Exception{
        preparedStatement=connection.prepareStatement ("UPDATE products SET numbers=? WHERE name=? ");

        ////////////////////////////////////////////////////////////////////Update Clothes
        preparedStatement.setInt (1,productEntity.getNumberOfTankTop());
        preparedStatement.setString (2,"TankTop");

        preparedStatement.setInt (1,productEntity.getNumberOfJeans());
        preparedStatement.setString (2,"Jeans");

        preparedStatement.setInt (1,productEntity.getNumberOfShirt());
        preparedStatement.setString (2,"Shirt");

        ////////////////////////////////////////////////////////////////////Update Food
        preparedStatement.setInt (1,productEntity.getNumberOfPizza());
        preparedStatement.setString (2,"Pizza");

        preparedStatement.setInt (1,productEntity.getNumberOfHotDog());
        preparedStatement.setString (2,"HotDog");

        preparedStatement.setInt (1,productEntity.getNumberOfTurkishKebab());
        preparedStatement.setString (2,"Turkish Kebab");

        ////////////////////////////////////////////////////////////////////Update Books
        preparedStatement.setInt (1,productEntity.getNumberOfLittlePrince());
        preparedStatement.setString (2,"Little Prince");

        preparedStatement.setInt (1,productEntity.getNumberOfWarAndPeace());
        preparedStatement.setString (2,"War And Peace");

        preparedStatement.setInt (1,productEntity.getNumberOfMetro2034());
        preparedStatement.setString (2,"Metro 2034");

        ////////////////////////////////////////////////////////////////////Update Kitchen
        preparedStatement.setInt (1,productEntity.getNumberOfFork());
        preparedStatement.setString (2,"Fork");

        preparedStatement.setInt (1,productEntity.getNumberOfOven());
        preparedStatement.setString (2,"Oven");

        preparedStatement.setInt (1,productEntity.getNumberOfPlate());
        preparedStatement.setString (2,"Plate");

        ////////////////////////////////////////////////////////////////////Update Tools
        preparedStatement.setInt (1,productEntity.getNumberOfTape());
        preparedStatement.setString (2,"Tape");

        preparedStatement.setInt (1,productEntity.getNumberOfAxe());
        preparedStatement.setString (2,"Axe");

        preparedStatement.setInt (1,productEntity.getNumberOfBat());
        preparedStatement.setString (2,"Bat");

        preparedStatement.executeUpdate ();
    }
////////////////////////////////////////////////////////////////////////////////////
public void insertEmployees(EmployeeEntity employeeEntity)throws Exception{
        preparedStatement=connection.prepareStatement("insert into Employees(Names,fathername,Age,PhoneNumber)values(?,?,?,?)");
        preparedStatement.setString(1,employeeEntity.getName());
        preparedStatement.setString(2,employeeEntity.getFathername());
        preparedStatement.setInt(3,employeeEntity.getAge());
        preparedStatement.setString(4,employeeEntity.getPhoneNumber());
        preparedStatement.executeUpdate();

}
///////////////////////////////////////////////////////////////////////////////////////
public void insertComments(CommentEntity commentEntity)throws Exception{
        preparedStatement=connection.prepareStatement("insert into Comments(idea)values (?)");
        preparedStatement.setString(1,commentEntity.getComment());
        preparedStatement.executeUpdate();

}
/////////////////////////////////////////////////////////////////////////////////////////////////
public void insertpayments(PaymentEntity paymentEntity)throws Exception{
        preparedStatement=connection.prepareStatement("insert into payments(Dates,Hours,CardNumber,Price)values (?,?,?,?)");
        preparedStatement.setString(1,paymentEntity.getDate());
        preparedStatement.setInt(2,paymentEntity.getHour());
        preparedStatement.setString(3,paymentEntity.getCardNumber());
        preparedStatement.setString(4,paymentEntity.getPrice());
        preparedStatement.executeUpdate();
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<CommentEntity> selectcomments()throws Exception{
        preparedStatement=connection.prepareStatement("select * from Comments");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<CommentEntity> commentEntityList=new ArrayList<>();
        while(resultSet.next()){
            CommentEntity commentEntity=new CommentEntity();
            commentEntity.setComment(resultSet.getString("Comment"));
            commentEntityList.add(commentEntity);
        }
        return commentEntityList;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void commit() throws Exception {
        connection.commit();
    }

    public void rollback() throws Exception {
        connection.rollback();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }

}
