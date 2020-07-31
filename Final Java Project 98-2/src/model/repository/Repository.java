package model.repository;

import controller.Controller;
import model.entity.*;
import view.Cart;

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

    /************************************************************************************ INSERTS */
    public void insertUserInfo(UserEntity userEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users(Melicode,Name,PhoneNumber,Address)values (?,?,?,?)");//primary key=Melicode
        preparedStatement.setString(1, userEntity.getMeliCode());
        preparedStatement.setString(2, userEntity.getName());
        preparedStatement.setString(3, userEntity.getPhoneNumber());
        preparedStatement.setString(4, userEntity.getAddress());
        preparedStatement.executeUpdate();
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public void insertProducts(ProductEntity productEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into products(Name , Price , numbers)values(?,?,?)");

        ////////////////////////////////////////////////////////////////////Clothes
        preparedStatement.setString(1, "TankTop");
        preparedStatement.setString(2, "10000");
        preparedStatement.setInt(3, productEntity.getNumberOfTankTop());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Jeans");
        preparedStatement.setString(2, "20000");
        preparedStatement.setInt(3, productEntity.getNumberOfJeans());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Shirt");
        preparedStatement.setString(2, "40000");
        preparedStatement.setInt(3, productEntity.getNumberOfShirt());
        preparedStatement.executeUpdate();
        ////////////////////////////////////////////////////////////////////Food
        preparedStatement.setString(1, "Pizza");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, productEntity.getNumberOfPizza());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "HotDog");
        preparedStatement.setString(2, "60000");
        preparedStatement.setInt(3, productEntity.getNumberOfHotDog());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Turkish Kebab");
        preparedStatement.setString(2, "60000");
        preparedStatement.setInt(3, productEntity.getNumberOfTankTop());
        preparedStatement.executeUpdate();
        ////////////////////////////////////////////////////////////////////Books
        preparedStatement.setString(1, "Little Prince");
        preparedStatement.setString(2, "523000");
        preparedStatement.setInt(3, productEntity.getNumberOfLittlePrince());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "War And Peace");
        preparedStatement.setString(2, "60075");
        preparedStatement.setInt(3, productEntity.getNumberOfWarAndPeace());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Metro 2034");
        preparedStatement.setString(2, "243200");
        preparedStatement.setInt(3, productEntity.getNumberOfMetro2034());
        preparedStatement.executeUpdate();
        ////////////////////////////////////////////////////////////////////Kitchen
        preparedStatement.setString(1, "Fork");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, productEntity.getNumberOfFork());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Oven");
        preparedStatement.setString(2, "70000");
        preparedStatement.setInt(3, productEntity.getNumberOfOven());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Plate");
        preparedStatement.setString(2, "600000");
        preparedStatement.setInt(3, productEntity.getNumberOfPlate());
        preparedStatement.executeUpdate();
        ////////////////////////////////////////////////////////////////////Tools
        preparedStatement.setString(1, "Tape");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, productEntity.getNumberOfTape());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Axe");
        preparedStatement.setString(2, "10000");
        preparedStatement.setInt(3, productEntity.getNumberOfAxe());
        preparedStatement.executeUpdate();

        preparedStatement.setString(1, "Bat");
        preparedStatement.setString(2, "700000");
        preparedStatement.setInt(3, productEntity.getNumberOfBat());
        preparedStatement.executeUpdate();
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public void insertEmployees(EmployeeEntity employeeEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into employees(Names,fathername,Age,PhoneNumber)values(?,?,?,?)");
        preparedStatement.setString(1, employeeEntity.getName());
        preparedStatement.setString(2, employeeEntity.getFathername());
        preparedStatement.setInt(3, employeeEntity.getAge());
        preparedStatement.setString(4, employeeEntity.getPhoneNumber());
        preparedStatement.executeUpdate();

    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public void insertComments(CommentEntity commentEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into Comments(idea)values (?)");
        preparedStatement.setString(1, commentEntity.getComment());
        preparedStatement.executeUpdate();

    }

    //create table payments ( time timestamp , cardnumber varchar2(20) , price varchar2(20) , name varchar2(30) , phonenumber varchar2(30) , melicode varchar2(10));
    public void insertPayments(UserEntity userEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into payments(time,cardnumber,price,name,phonenumber,melicode)values (?,?,?,?,?,?)");
        java.util.Date date = new java.util.Date();
        long t = date.getTime();
        java.sql.Timestamp sqlTime = new java.sql.Timestamp(t);
        preparedStatement.setTimestamp(1, sqlTime);
        preparedStatement.setString(2, userEntity.getCardNumber());
        preparedStatement.setString(3, userEntity.getTotalPrice());
        preparedStatement.setString(4, userEntity.getName());
        preparedStatement.setString(5, userEntity.getPhoneNumber());
        preparedStatement.setString(6, userEntity.getMeliCode());
        preparedStatement.executeUpdate();
    }

    // create table documents ( time timestamp , cardnumber varchar2(20) , price varchar2(20));
    public void insertDocuments(UserEntity userEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into documents(time , cardnumber , price)values (?,?,?)");
        java.util.Date date = new java.util.Date();
        long t = date.getTime();
        java.sql.Timestamp sqlTime = new java.sql.Timestamp(t);
        preparedStatement.setTimestamp(1, sqlTime);
        preparedStatement.setString(2, userEntity.getCardNumber());
        preparedStatement.setString(3, userEntity.getTotalPrice());
        preparedStatement.executeUpdate();
    }

    /************************************************************************************ SELECTS */
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
        return userEntityList;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public List<UserEntity> selectDocuments() throws Exception {
        preparedStatement = connection.prepareStatement("select * from documents");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<UserEntity> userEntityList = new ArrayList<>();
        while (resultSet.next()) {
            UserEntity userEntity = new UserEntity();
            userEntity.setDate(resultSet.getDate("time"));
            userEntity.setCardNumber(resultSet.getString("cardnumber"));
            userEntity.setTotalPrice(resultSet.getString("price"));
            userEntityList.add(userEntity);
        }
        return userEntityList;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public List<ProductEntity> selectproducts() throws Exception {
        preparedStatement = connection.prepareStatement("select * from products");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<ProductEntity> productEntityList = new ArrayList<>();
        while (resultSet.next()) {
            ProductEntity productEntity = new ProductEntity();
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

    ////////////////////////////////////////////////////////////////////////////////////////
    public List<EmployeeEntity> selectemployees() throws Exception {
        preparedStatement = connection.prepareStatement("select * from Employees");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<EmployeeEntity> employeeEntityList = new ArrayList<>();
        while (resultSet.next()) {
            EmployeeEntity employeeEntity = new EmployeeEntity();
            employeeEntity.setName(resultSet.getString("Name"));
            employeeEntity.setFathername(resultSet.getString("Fathername"));
            employeeEntity.setAge(resultSet.getInt("Age"));
            employeeEntity.setPhoneNumber(resultSet.getString("Phonenumber"));
            employeeEntityList.add(employeeEntity);
        }
        return employeeEntityList;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public String selectPrice(String name) throws Exception {
        String price = "";
        preparedStatement = connection.prepareStatement("select price from products where name =?");
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next())
            price = resultSet.getString("price");
        return price;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public List<CommentEntity> selectcomments() throws Exception {
        preparedStatement = connection.prepareStatement("select * from Comments");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<CommentEntity> commentEntityList = new ArrayList<>();
        while (resultSet.next()) {
            CommentEntity commentEntity = new CommentEntity();
            commentEntity.setComment(resultSet.getString("Comment"));
            commentEntityList.add(commentEntity);
        }
        return commentEntityList;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public int selectNumber(String name) throws Exception {
        int number = 0;
        preparedStatement = connection.prepareStatement("select numbers from products where name =?");
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next())
            number = resultSet.getInt("numbers");
        return number;
    }


    /************************************************************************************ UPDATES */
    public void updateNumberOfProduct(ProductEntity productEntity, String name) throws Exception {
        preparedStatement = connection.prepareStatement("UPDATE products SET numbers=? WHERE name=? ");
        Controller controller = new Controller();
        preparedStatement.setInt(1, controller.numberReporter(name) - 1);
        preparedStatement.setString(2, name);
        preparedStatement.executeUpdate();
    }

    /************************************************************************************ DELETE */
    public void deleteProducts() throws SQLException {
        preparedStatement = connection.prepareStatement("DELETE FROM products");
        preparedStatement.executeUpdate();
    }


    /********************************************************************************************/
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
