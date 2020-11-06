package com.wyp.factory.simpleFactory;

public class Factory {

    public static Product creatProduct(String productName){
        Product product = null;
        switch (productName){
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                System.out.println("-------没有该产品-------");
                 return product;
        }
        return product;
    }
}
