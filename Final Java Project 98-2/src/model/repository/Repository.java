package model.repository;
import model.entity.Entity;
import model.service.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repository()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","digikala","myjava123");
        connection.setAutoCommit(false);
    }

    public List<Entity>select()throws Exception{
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

    public void insertUserInfo(Entity entity)throws Exception{
        preparedStatement=connection.prepareStatement("insert into users(Melicode,Name,PhoneNumber,Address)values (?,?,?,?)");//primary key=Melicode
        preparedStatement.setString(1,entity.getMeliCode());
        preparedStatement.setString(2,entity.getName());
        preparedStatement.setString(3,entity.getPhoneNumber());
        preparedStatement.setString(4,entity.getAddress());
        preparedStatement.executeUpdate();
    }

    public void insertProducts()throws Exception{
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
        preparedStatement.executeUpdate ();
    }
   public void insertnumbers(Entity entity)throws Exception{
        preparedStatement=connection.prepareStatement("insert into numbers(Category,Name,amount)values(?,?,?)");
        //Category
        preparedStatement.setString(1,"Clothes");
        preparedStatement.setString(1,"Food");
        preparedStatement.setString(1,"Book And etc");
        preparedStatement.setString(1,"Home And Kitchen");
        preparedStatement.setString(1,"Tools");
        //Nameclothes
        preparedStatement.setString(2,"TankTop");
        preparedStatement.setInt(3,2);
        preparedStatement.setString(2,"Jeans");
        preparedStatement.setInt(3,2);
        preparedStatement.setString(2,"Shirt");
        preparedStatement.setInt(3,2);
//NameFood
       preparedStatement.setString(2,"Pizza");
       preparedStatement.setInt(3,2);
       preparedStatement.setString(2,"HotDog");
       preparedStatement.setInt(3,2);
       preparedStatement.setString(2,"Turkish Kebab");
       preparedStatement.setInt(3,2);
       //NameBooks
       preparedStatement.setString(2,"Little Prince");
       preparedStatement.setInt(3,2);
       preparedStatement.setString(2,"War And Peace");
       preparedStatement.setInt(3,2);
       preparedStatement.setString(2,"Metro 2034");
       preparedStatement.setInt(3,2);
//NameKitchen
       preparedStatement.setString(2,"Fork");
       preparedStatement.setInt(3,2);
       preparedStatement.setString(2,"Oven");
       preparedStatement.setInt(3,2);
       preparedStatement.setString(2,"Plate");
       preparedStatement.setInt(3,2);
       //NameTools
       preparedStatement.setString(2,"Tape");
       preparedStatement.setInt(3,2);
       preparedStatement.setString(2,"Axe");
       preparedStatement.setInt(3,2);
       preparedStatement.setString(2,"Bat");
       preparedStatement.setInt(3,2);
   }
public void updateMatherial(Entity entity)throws Exception{
        preparedStatement=connection.prepareStatement("update numbers set name=? where amount=?");
preparedStatement.setString(1,"TankTop");
preparedStatement.setInt(2,entity.getNumber());
preparedStatement.setString(1,"Jeans");
preparedStatement.setInt(2,entity.getNumber());
preparedStatement.setString(1,"Shorts");
preparedStatement.setInt(2,entity.getNumber());
//updateFood
    preparedStatement.setString(1,"Pizza");
    preparedStatement.setInt(2,entity.getNumber());
    preparedStatement.setString(1,"HotDog");
    preparedStatement.setInt(2,entity.getNumber());
    preparedStatement.setString(1,"Turkish Kebab");
    preparedStatement.setInt(1,entity.getNumber());
    //UpdateBooks
    preparedStatement.setString(1,"Little Prince");
    preparedStatement.setInt(2,entity.getNumber());
    preparedStatement.setString(1,"War And Peace");
    preparedStatement.setInt(2,entity.getNumber());
    preparedStatement.setString(1,"Metro 2034");
    preparedStatement.setInt(2,entity.getNumber());
    //UpdateKitchen
    preparedStatement.setString(1,"Fork");
    preparedStatement.setInt(2,entity.getNumber());
    preparedStatement.setString(1,"Oven");
preparedStatement.setInt(2,entity.getNumber());
preparedStatement.setString(1,"Plate");
preparedStatement.setInt(2,entity.getNumber());
//UpdateTools
    preparedStatement.setString(1,"Tape");
    preparedStatement.setInt(2,entity.getNumber());
    preparedStatement.setString(1,"Axe");
    preparedStatement.setInt(2,entity.getNumber());
    preparedStatement.setString(1,"Bat");
    preparedStatement.setInt(2,entity.getNumber());
    if(entity.getNumber()==0){
        System.out.println("Out of Stock");
    }
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
