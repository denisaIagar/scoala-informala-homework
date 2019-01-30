package bv;


class VegetalProduct extends Product {

    private String vitaminsList ;

    VegetalProduct(String name, int productID, double price, String validityDate, double weight, int quantity, String vitaminsList) {
        super(name,productID ,price, validityDate, weight, quantity);
        this.vitaminsList = vitaminsList;
    }
}
