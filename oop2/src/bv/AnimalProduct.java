package bv;

public class AnimalProduct extends Product {
    private int storageTemp;


    AnimalProduct(String name, int productID, double price, String validityDate, double weight, int quantity, int storageTemp) {
        super(name, productID ,price, validityDate, weight, quantity);
        this.storageTemp = storageTemp;
    }

    public int getStorageTemp() {
        return storageTemp;
    }

    public void setStorageTemp(int storageTemp) {
        this.storageTemp = storageTemp;
    }
}


