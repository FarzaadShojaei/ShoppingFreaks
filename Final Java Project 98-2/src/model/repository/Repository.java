package model.repository;
import model.entity.Entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    private PreparedStatement preparedStatement1;
    private PreparedStatement preparedStatement2;
    private PreparedStatement preparedStatement3;
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
        preparedStatement1=connection.prepareStatement("insert into products(Category,Name,Price)values(?,?,?)");
        preparedStatement1.setString(1,"Clothes");
        preparedStatement1.setString(1,"Food");
        preparedStatement1.setString(1,"Book");
        preparedStatement1.setString(1,"Home and Kitchen");
        preparedStatement1.setString(1,"Tools");
        preparedStatement1.executeUpdate();
        //clothes
        preparedStatement1.setString(2,"TankTop");
        preparedStatement1.setString(2,"Jeans");
        preparedStatement1.setString(2,"Shirt");
        preparedStatement1.executeUpdate();
        //foods
        preparedStatement1.setString(2,"Pizza");
        preparedStatement1.setString(2,"HotDog");
        preparedStatement1.setString(2,"Turkish Kebab");
        preparedStatement1.executeUpdate();
        //books
        preparedStatement1.setString(2,"Little Prince");
        preparedStatement1.setString(2,"War & Peace");
        preparedStatement1.setString(2,"Metro 2034");
        preparedStatement1.executeUpdate();
        //things
        preparedStatement1.setString(2,"Fork");
        preparedStatement1.setString(2,"Oven");
        preparedStatement1.setString(2,"Plate");
        preparedStatement1.executeUpdate();
        //tools
        preparedStatement1.setString(2,"Tape");
        preparedStatement1.setString(2,"Axe");
        preparedStatement1.setString(2,"Bat");
        preparedStatement1.executeUpdate();
        //prices of clothes
        preparedStatement1.setString(3,"10000");
        preparedStatement1.setString(3,"20000");
        preparedStatement1.setString(3,"40000");
        preparedStatement1.executeUpdate();
        //prices of foods
        preparedStatement1.setString(3,"50000");
        preparedStatement1.setString(3,"60000");
        preparedStatement1.setString(3,"60000");
        preparedStatement1.executeUpdate();
        //prices of books
        preparedStatement1.setString(3,"523000");
        preparedStatement1.setString(3,"60075");
        preparedStatement1.setString(3,"243200");
        preparedStatement1.executeUpdate();
        //prices of things
        preparedStatement1.setString(3,"50000");
        preparedStatement1.setString(3,"70000");
        preparedStatement1.setString(3,"600000");
        preparedStatement1.executeUpdate();
        //prices of tools
        preparedStatement1.setString(3,"50000");
        preparedStatement1.setString(3,"10000");
        preparedStatement1.setString(3,"700000");
        preparedStatement1.executeUpdate();
    }
    public void insert2()throws Exception{
        preparedStatement2=connection.prepareStatement("insert into employees(Code,name)values (?,?)");
        preparedStatement2.setInt(1,1);
        preparedStatement2.setString(2,"ali");
        preparedStatement2.setInt(1,2);
        preparedStatement2.setString(2,"reza");
        preparedStatement2.setInt(1,3);
        preparedStatement2.setString(2,"mohammad");

        preparedStatement2.executeUpdate();
    }
    public void insert3(Entity entity)throws Exception{
preparedStatement3=connection.prepareStatement("insert into Comments(id,idea) values (?,?)");
preparedStatement3.setInt(1,entity.getId());
preparedStatement3.setString(2,entity.getIdea());
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
