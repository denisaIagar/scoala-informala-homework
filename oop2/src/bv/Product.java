package bv;

import java.time.LocalDate;

/**
 * store product name, id and stock number
 */
public class Product {

    private String name;
    private int productID;
    private double price;
    private String validityDate;
    private double weight;
    private int quantity;
    private LocalDate sellDate;

    Product(String name, int productID, double price, String validityDate, double weight, int quantity) {
        this.name = name;
        this.productID = productID;
        this.price = price;
        this.validityDate = validityDate;
        this.weight = weight;
        this.quantity = quantity;
    }
    Product(int productID, int quantity){
        this.sellDate = LocalDate.now();
        this.productID = productID;
        this.quantity = quantity;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    LocalDate getSellDate() {
        return sellDate;
    }

}

