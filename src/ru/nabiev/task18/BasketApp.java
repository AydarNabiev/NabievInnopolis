package ru.nabiev.task18;

import java.util.ArrayList;
import java.util.List;

public class BasketApp implements Basket {
    ArrayList<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        BasketApp myBasket = new BasketApp();
        myBasket.addProduct("Chocolate", 3);
        myBasket.addProduct("Milk", 5);
        myBasket.addProduct("Potato", 8);
        myBasket.removeProduct("Chocolate");
        System.out.println("Проверим, сколько молока - " + myBasket.getProductQuantity("Milk"));
        myBasket.updateProductQuantity("Milk", 5);
        myBasket.getProducts();
        myBasket.clear();
    }

    @Override
    public void addProduct(String product, int quantity) {
        products.add(new Product(product, quantity));
        System.out.println("Я добавил продукт " + product);
        System.out.println(products);
    }

    @Override
    public void removeProduct(String product) {
        for(int removeNumber = 0; removeNumber < products.size(); removeNumber ++) {
            if(products.get(removeNumber).getProduct().equals(product)){
                products.remove(removeNumber);
                System.out.println("Я удалил элемент " + product);
            }
        }
        System.out.println(products);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for(int updateNumber = 0; updateNumber <= products.size() - 1; updateNumber ++) {
            if(products.get(updateNumber).getProduct().equals(product)){
                products.get(updateNumber).setQuantity(products.get(updateNumber).getQuantity() + quantity);
                System.out.println("Стало " + products.get(updateNumber).getQuantity() + " " + product);
            }
        }
        System.out.println(products);
    }

    @Override
    public void clear() {
        products.clear();
        System.out.println("Я очистил корзину");
        System.out.println(products);
    }

    @Override
    public List<String> getProducts() {
        System.out.println(products);
        for(int getProductsNum = 0; getProductsNum <= products.size() - 1; getProductsNum ++) {
            System.out.println("Продукт " + products.get(getProductsNum).getProduct());
            System.out.println("Количество  " + products.get(getProductsNum).getQuantity());
        }
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        int getProductNumber;
        for(getProductNumber = 0; getProductNumber <= products.size() - 1; getProductNumber ++) {
            if(products.get(getProductNumber).getProduct().equals(product)){
                return products.get(getProductNumber).getQuantity();
            } else {
                return 0;
            }
        }
        return products.get(getProductNumber).getQuantity();
    }
}