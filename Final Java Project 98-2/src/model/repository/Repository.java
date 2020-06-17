package model.repository;
import model.entity.Entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection=DriverManager.getConnection("oracle:jdbc:thin:@localhost:1521:xe","Digikala","myjava123");
        connection.setAutoCommit(false);
    }
    public List<Entity>select(Entity resultset)throws Exception{
        preparedStatement=connection.prepareStatement("select * from users");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Entity>entityList=new ArrayList<>();
        while(resultSet.next()){
            Entity entity=new Entity();
            entity.setMeliCode(resultSet.getString("melicode"));
            entity.setName(resultSet.getString("Name"));
            entity.setPhoneNumber(resultSet.getString("PhoneNumber"));
            entity.setAddress(resultSet.getString("Address"));
            entityList.add(entity);
        }
        if(resultSet.next()){
            System.out.println("You May Enter");
        }
        else {
            System.out.println("you Cannot Enter");
            System.exit(0);
        }
        return entityList;

    }
    public void insert(Entity entity)throws Exception{
preparedStatement=connection.prepareStatement("insert into users(Melicode,Name,PhoneNumber,Address)values (?,?,?,?)");//primary key=Melicode
preparedStatement.setString(1,entity.getMeliCode());
preparedStatement.setString(2,entity.getName());
preparedStatement.setString(3,entity.getPhoneNumber());
preparedStatement.setString(4,entity.getAddress());
preparedStatement.executeUpdate();
    }
    public void insert1()throws Exception{
        preparedStatement=connection.prepareStatement("insert into products(Category,Name,Price)values(?,?,?)");
        preparedStatement.setString(1,"Clothes");
        preparedStatement.setString(1,"Food");
        preparedStatement.setString(1,"Book&etc");
        preparedStatement.setString(1,"Home&Kitchen Things");
        preparedStatement.setString(1,"Tools");
        //clothes
        preparedStatement.setString(2,"TankTop");
        preparedStatement.setString(2,"Jeans");
        preparedStatement.setString(2,"Shirt");
        //foods
        preparedStatement.setString(2,"Pizza");
        preparedStatement.setString(2,"HotDog");
        preparedStatement.setString(2,"Turkish Kebab");
        //books
        preparedStatement.setString(2,"Little Prince");
        preparedStatement.setString(2,"War & Peace");
        preparedStatement.setString(2,"Metro 2034");
        //things
        preparedStatement.setString(2,"Fork");
        preparedStatement.setString(2,"Oven");
        preparedStatement.setString(2,"Plate");
        //tools
        preparedStatement.setString(2,"Tape");
        preparedStatement.setString(2,"Axe");
        preparedStatement.setString(2,"Bat");
        //prices of clothes
        preparedStatement.setString(3,"10000");
        preparedStatement.setString(3,"20000");
        preparedStatement.setString(3,"40000");
        //prices of foods
        preparedStatement.setString(3,"50000");
        preparedStatement.setString(3,"60000");
        preparedStatement.setString(3,"60000");
        //prices of books
        preparedStatement.setString(3,"523000");
        preparedStatement.setString(3,"60075");
        preparedStatement.setString(3,"243200");
        //prices of things
        preparedStatement.setString(3,"50000");
        preparedStatement.setString(3,"70000");
        preparedStatement.setString(3,"600000");
        //prices of tools
        preparedStatement.setString(3,"50000");
        preparedStatement.setString(3,"10000");
        preparedStatement.setString(3,"700000");
    }
    public void commit()throws Exception{
        connection.commit();
    }
    public void rollback()throws Exception{
        connection.rollback();
    }
    @Override
    public void close()throws Exception{
        preparedStatement.close();
        connection.close();
    }

}
