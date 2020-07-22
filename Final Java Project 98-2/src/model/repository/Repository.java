package model.repository;

import model.entity.UserEntity;

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

    public void insertUserInfo(UserEntity userEntity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users(Melicode,Name,PhoneNumber,Address)values (?,?,?,?)");//primary key=Melicode
        preparedStatement.setString(1, userEntity.getMeliCode());
        preparedStatement.setString(2, userEntity.getName());
        preparedStatement.setString(3, userEntity.getPhoneNumber());
        preparedStatement.setString(4, userEntity.getAddress());
        preparedStatement.executeUpdate();
    }

    public void insertProducts() throws Exception {
        preparedStatement = connection.prepareStatement("insert into products(Name , Price , numbers)values(?,?,?)");

        ////////////////////////////////////////////////////////////////////Clothes
        preparedStatement.setString(1, "TankTop");
        preparedStatement.setString(2, "10000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "Jeans");
        preparedStatement.setString(2, "20000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "Shirt");
        preparedStatement.setString(2, "40000");
        preparedStatement.setInt(3, 2);
        ////////////////////////////////////////////////////////////////////Food
        preparedStatement.setString(1, "Pizza");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "HotDog");
        preparedStatement.setString(2, "60000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "Turkish Kebab");
        preparedStatement.setString(2, "60000");
        preparedStatement.setInt(3, 2);
        ////////////////////////////////////////////////////////////////////Books
        preparedStatement.setString(1, "Little Prince");
        preparedStatement.setString(2, "523000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "War And Peace");
        preparedStatement.setString(2, "60075");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "Metro 2034");
        preparedStatement.setString(2, "243200");
        preparedStatement.setInt(3, 2);
        ////////////////////////////////////////////////////////////////////Kitchen
        preparedStatement.setString(1, "Fork");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "Oven");
        preparedStatement.setString(2, "70000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "Plate");
        preparedStatement.setString(2, "600000");
        preparedStatement.setInt(3, 2);
        ////////////////////////////////////////////////////////////////////Tools
        preparedStatement.setString(1, "Tape");
        preparedStatement.setString(2, "50000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "Axe");
        preparedStatement.setString(2, "10000");
        preparedStatement.setInt(3, 2);

        preparedStatement.setString(1, "Bat");
        preparedStatement.setString(2, "700000");
        preparedStatement.setInt(3, 2);

        preparedStatement.executeUpdate();
    }

    public void updateMatherial(UserEntity userEntity) throws Exception {
        preparedStatement = connection.prepareStatement("update numbers set name=? where amount=?");
        preparedStatement.setString(1, "TankTop");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "Jeans");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "Shorts");
        preparedStatement.setInt(2, userEntity.getNumber());
        ////////////////////////////////////////////////////////////////////updateFood
        preparedStatement.setString(1, "Pizza");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "HotDog");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "Turkish Kebab");
        preparedStatement.setInt(1, userEntity.getNumber());
        ////////////////////////////////////////////////////////////////////UpdateBooks
        preparedStatement.setString(1, "Little Prince");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "War And Peace");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "Metro 2034");
        preparedStatement.setInt(2, userEntity.getNumber());
        ////////////////////////////////////////////////////////////////////UpdateKitchen
        preparedStatement.setString(1, "Fork");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "Oven");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "Plate");
        preparedStatement.setInt(2, userEntity.getNumber());
        ////////////////////////////////////////////////////////////////////UpdateTools
        preparedStatement.setString(1, "Tape");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "Axe");
        preparedStatement.setInt(2, userEntity.getNumber());
        preparedStatement.setString(1, "Bat");
        preparedStatement.setInt(2, userEntity.getNumber());
        if (userEntity.getNumber() == 0) {
            System.out.println("Out of Stock");
        }
    }

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
