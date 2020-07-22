package model.service;

import model.entity.ProductEntity;
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

    public void initialization (ProductEntity productEntity) throws Exception {
        try (Repository repository = new Repository()) {

            productEntity.setNumberOfAxe(2);
            productEntity.setNumberOfBat(2);
            productEntity.setNumberOfFork(2);
            productEntity.setNumberOfHotDog(2);
            productEntity.setNumberOfJeans(2);
            productEntity.setNumberOfLittlePrince(2);
            productEntity.setNumberOfMetro2034(2);
            productEntity.setNumberOfOven(2);
            productEntity.setNumberOfPizza(2);
            productEntity.setNumberOfPlate(2);
            productEntity.setNumberOfShirt(2);
            productEntity.setNumberOfTankTop(2);
            productEntity.setNumberOfTape(2);
            productEntity.setNumberOfTurkishKebab(2);
            productEntity.setNumberOfWarAndPeace(2);

            repository.insertProducts (productEntity);
            repository.commit ();
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
