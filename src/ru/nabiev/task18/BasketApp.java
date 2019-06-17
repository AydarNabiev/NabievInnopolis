package ru.nabiev.task18;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

public class BasketApp implements Basket {
    ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        BasketApp myBasket = new BasketApp();
        myBasket.addProduct("Chocolate", 3);
        myBasket.addProduct("Chocolate", 3);
        myBasket.addProduct("Milk", 5);
        myBasket.addProduct("Potato", 8);
        myBasket.removeProduct("Chocolate");
        myBasket.getProductQuantity("Milk");
        myBasket.getProductQuantity("Chocolate");
        myBasket.updateProductQuantity("Milk", 5);
        myBasket.updateProductQuantity("Chocolate", 2);
        myBasket.getProducts();
        myBasket.clear();
    }

    @Override
    public void addProduct(String product, int quantity) {
        if (!products.isEmpty()) {
            boolean isExist = false;
            int number = 0;
            for (int addNumber = 0; addNumber < products.size(); addNumber++) {
                if (products.get(addNumber).getProduct().equals(product)) {
                    isExist = true;
                    number = addNumber;
                }
            }
            if (isExist) {
                products.get(number).setQuantity(products.get(number).getQuantity() + quantity);
                System.out.println("Добавили существующий продукт " + product + ".");
                System.out.println("Теперь количество стало " + products.get(number).getQuantity() + ".");
            } else {
                products.add(new Product(product, quantity));
                System.out.println("Я добавил продукт " + product);
            }
        } else {
            products.add(new Product(product, quantity));
            System.out.println("Я добавил продукт " + product);
        }

        System.out.println(products);
        System.out.println("-----------------------");
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
        System.out.println("-----------------------");
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for(int updateNumber = 0; updateNumber < products.size(); updateNumber ++) {
            if(products.get(updateNumber).getProduct().equals(product)){
                products.get(updateNumber).setQuantity(products.get(updateNumber).getQuantity() + quantity);
                System.out.println("Стало " + products.get(updateNumber).getQuantity() + " " + product);
                //System.out.println("-----------------------");
            }
        }
        System.out.println(products);
        System.out.println("-----------------------");
    }

    @Override
    public void clear() {
        products.clear();
        System.out.println("Я очистил корзину");
        System.out.println(products);
        System.out.println("-----------------------");
    }

    @Override
    public List<String> getProducts() {
        for(int getProductsNum = 0; getProductsNum < products.size(); getProductsNum ++) {
            System.out.println("Продукт " + products.get(getProductsNum).getProduct());
            System.out.println("Количество  " + products.get(getProductsNum).getQuantity());
        }
        System.out.println("-----------------------");
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        int getProductNumber;
        for(getProductNumber = 0; getProductNumber < products.size(); getProductNumber ++) {
            if(products.get(getProductNumber).getProduct().equals(product)){
                System.out.println("Количество " + product + " - " + products.get(getProductNumber).getQuantity() + ".");
                System.out.println("-----------------------");
                return products.get(getProductNumber).getQuantity();
            } else {
                System.out.println("Не найдено " + product + ".");
                System.out.println("-----------------------");
                return 0;
            }
        }
        System.out.println("-----------------------");
        return products.get(getProductNumber).getQuantity();
    }
}