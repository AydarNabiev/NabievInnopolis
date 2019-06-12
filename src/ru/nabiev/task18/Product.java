package ru.nabiev.task18;

public class Product{
    String product;
    int quantity;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
