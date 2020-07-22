package model.service;

import model.entity.UserEntity;
import model.repository.Repository;

import java.util.List;

public class Service {
    private Service(){};
    private static Service service=new Service();
    public static Service getInstance(){return service;}
    public void save(UserEntity userEntity)throws Exception {
        try (Repository repository = new Repository()) {
            repository.insertUserInfo(userEntity);
            repository.commit();
        }
    }

  public List<UserEntity>report()throws Exception{
      List<UserEntity> entities;
      try(Repository repository=new Repository()){
          entities=repository.select();
      }
      return entities;
  }
}
