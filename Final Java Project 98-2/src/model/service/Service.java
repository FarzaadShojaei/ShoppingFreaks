package model.service;

import model.entity.CommentEntity;
import model.entity.PaymentEntity;
import model.entity.ProductEntity;
import model.entity.UserEntity;
import model.repository.Repository;

import java.util.List;

public class Service {
    private Service() {
    }

    private static Service service = new Service();

    public static Service getInstance() {
        return service;
    }

    public void save(UserEntity userEntity) throws Exception {
        try (Repository repository = new Repository()) {
            repository.insertUserInfo(userEntity);
            repository.commit();
        }
    }

    public void savePayment(PaymentEntity paymentEntity) throws Exception {
        try (Repository repository = new Repository()) {
            repository.insertpayments(paymentEntity);
            repository.commit();
        }
    }

    public void savecomment(CommentEntity commentEntity) throws Exception {
        try (Repository repository = new Repository()) {
            repository.insertComments(commentEntity);
            repository.commit();
        }
    }

    public void saveDocuments(UserEntity userEntity) throws Exception {
        try (Repository repository = new Repository()) {
            repository.insertDocuments(userEntity);
            repository.commit();
        }
    }

    public void initialization(ProductEntity productEntity) throws Exception {
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

            repository.insertProducts(productEntity);
            repository.commit();
        }
    }

    ///////////////////////////////////////////////////////////////// Reports
    public List<PaymentEntity> reportpayment() throws Exception {
        List<PaymentEntity> paymentEntities;
        try (Repository repository = new Repository()) {
            paymentEntities = repository.selectpayments();
        }
        return paymentEntities;
    }

    /////////////////////////////////////////////////////////////////
    public List<ProductEntity> reportproduct() throws Exception {
        List<ProductEntity> productEntities;
        try (Repository repository = new Repository()) {
            productEntities = repository.selectproducts();
        }
        return productEntities;
    }

    /////////////////////////////////////////////////////////////////
    public List<CommentEntity> reportcomment() throws Exception {
        List<CommentEntity> commentEntities;
        try (Repository repository = new Repository()) {
            commentEntities = repository.selectcomments();
        }
        return commentEntities;
    }

    /////////////////////////////////////////////////////////////////
    public String reportPrice(String name) throws Exception {
        Repository repository = new Repository();
        return repository.selectPrice(name);
    }

    /////////////////////////////////////////////////////////////////
    public List<UserEntity> report() throws Exception {
        List<UserEntity> entities;
        try (Repository repository = new Repository()) {
            entities = repository.select();
        }
        return entities;
    }

    /////////////////////////////////////////////////////////////////
    public List<UserEntity> reportDocument() throws Exception {
        List<UserEntity> entities;
        try (Repository repository = new Repository()) {
            entities = repository.selectDocuments();
        }
        return entities;
    }

    /////////////////////////////////////////////////////////////////
    public int reportNumbers(String name) throws Exception {
        Repository repository = new Repository();
        return repository.selectNumber(name);
    }

    ///////////////////////////////////////////////////////////////// Removes
    public void removeProducts() throws Exception {
        Repository repository = new Repository();
        repository.deleteProducts();
        repository.commit();
    }

    ///////////////////////////////////////////////////////////////// Edits
    public void editNOProducts (ProductEntity productEntity , String productName) throws Exception{
        try (Repository repository = new Repository()){
            repository.updateNumberOfProduct(productEntity , productName);
//            switch (productName) {
//                case "TankTop":
//                    productEntity.setNumberOfTankTop(productEntity.getNumberOfTankTop()-1);
//                    break;
//                case "Jeans":
//                    productEntity.setNumberOfJeans(productEntity.getNumberOfJeans()-1);
//                    break;
//                case "Shirt":
//                    productEntity.setNumberOfShirt(productEntity.getNumberOfShirt()-1);
//                    break;
//                case "Pizza":
//                    productEntity.setNumberOfPizza(productEntity.getNumberOfPizza()-1);
//                    break;
//                case "HotDog":
//                    productEntity.setNumberOfHotDog(productEntity.getNumberOfHotDog()-1);
//                    break;
//                case "Turkish Kebab":
//                    productEntity.setNumberOfTurkishKebab(productEntity.getNumberOfTurkishKebab()-1);
//                    break;
//                case "Little Prince":
//                    productEntity.setNumberOfLittlePrince(productEntity.getNumberOfLittlePrince()-1);
//                    break;
//                case "War And Peace":
//                    productEntity.setNumberOfWarAndPeace(productEntity.getNumberOfWarAndPeace()-1);
//                    break;
//                case "Metro 2034":
//                    productEntity.setNumberOfMetro2034(productEntity.getNumberOfMetro2034()-1);
//                    break;
//                case "Fork":
//                    productEntity.setNumberOfFork(productEntity.getNumberOfFork()-1);
//                    break;
//                case "Oven":
//                    productEntity.setNumberOfOven(productEntity.getNumberOfOven()-1);
//                    break;
//                case "Plate":
//                    productEntity.setNumberOfPlate(productEntity.getNumberOfPlate()-1);
//                    break;
//                case "Tape":
//                    productEntity.setNumberOfTape(productEntity.getNumberOfTape()-1);
//                    break;
//                case "Axe":
//                    productEntity.setNumberOfAxe(productEntity.getNumberOfAxe()-1);
//                    break;
//                case "Bat":
//                    productEntity.setNumberOfBat(productEntity.getNumberOfBat()-1);
//                    break;
//                default:
//                    System.out.println("Faild to update");
//            }

            repository.commit ();
        }
    }
}
