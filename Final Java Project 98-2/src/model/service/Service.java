package model.service;

import model.entity.Entity;
import model.repository.Repository;

import java.util.List;

public class Service {
    private Service(){};
    private static Service service=new Service();
    public static Service getInstance(){return service;}
  public List<Entity>report(Entity entity1)throws Exception{
      List<Entity>entityList;
      try(Repository repository=new Repository()){
          entityList=repository.select(entity1);
      }
      return entityList;
  }

}
