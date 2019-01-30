package bv;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A farm sells animal and vegetable products at the local store.
 * All products have on their packaging the price, validity date and weight.
 * The animal products in the store are the following: milk, eggs and various other products made out of milk (such as cheese, yogurt, sour cream).
 * All animal products have on their packaging storage temperature.
 * All vegetal products describe on their packaging a list of vitamins they contain.
 *
 * Please create a program which simulates the operations at a store.
 * The store has a list of item in stock.
 * Each item refers to a product and has a stock number (could be 0 if it's out of stock).
 * A product is identified uniquely by an ID.
 *
 * When you run the program it should display a list of options:
 *
 * -------------------------------------------------------------
 * 1. Create product and add it to stock
 * 2. Sell product
 * 3. Display daily sales report
 * 4. Exit
 *
 * Choose an option:
 * -------------------------------------------------------------
 *
 * When the user chooses 1, the program displays:
 * -------------------------------------------------------------
 * Product type (1 - animal; 2 - vegetable):
 * -------------------------------------------------------------
 *
 * Based on the user's choice, give him/her the opportunity to input all the relevant properties, create the product and add it to the stock.
 *
 *
 * When the user chooses 2, the program displays a table (don't worry about the table's appearance, just display the data in a readable format) with the products.
 * Give the user the chance to input the product's ID and quantity.
 * The system validates the order first: searches for the product that it exists and if it exists makes sure that it's in stock.
 * If the order is valid, saves the order, with the date when it was placed (date format could be (String): "yyyy-MM-dd"), product ID and quantity.
 *
 * When the user chooses 3, give him/her the chance to enter a date (in the same format used for orders) and display a list with all the orders from that date.
 *
 * When the users chooses 4 the program ends.
 */

public class Main {
    private static List<AnimalProduct> animalList = new ArrayList<AnimalProduct>();
    private static List<VegetalProduct> vegetableProductList = new ArrayList<VegetalProduct>();
    private static List <Product> sellList = new ArrayList<Product>();

    static Scanner scan = new Scanner(System.in);

    /**
     * method to display main menu
     */

    public static void main(String[] args) {
        addAvaialbleProducts();
        int userChoice;
        boolean quit = false;

        do {
            System.out.println("\n1. Create product and add it to stock."
                    + "\n2. Sell product."
                    + "\n3. Display daily sales report"
                    + "\n4. Exit"
                    + "\nChoose an option: ");

            userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Product type (1 - animal; 2 - vegetable): ");
                    int answer = scan.nextInt();
                    switch (answer) {
                        case 1:
                            addProduct("1");
                            break;
                        case 2:
                            addProduct("2");
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }

                    break;

                case 2:
                    printList();
                    sellProduct();
                    break;

                case 3:
                    System.out.println(LocalDate.now());
                    showSellListRepot();
                    break;

                case 4:
                    System.out.println("Exit from the main menu! ");
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }


        }
        while (!quit);


    }

    /**
     * method to create a new product and add it to stock
     * @param productType
     */
    private static void addProduct(String productType) {
        String name;
        int productID;
        double price;
        String validityDate;
        double weight;
        int quantity;
        int storageTemp;
        String vitaminsList;

        System.out.println("Enter  product name: ");
        name = scan.next();

        System.out.println("Enter product price: ");
        price = scan.nextDouble();

        System.out.println("Enter the expiration data: ");
        validityDate = scan.next();

        System.out.println(" Enter weight in grams: ");
        weight = scan.nextDouble();

        System.out.println("Enter quantity in units: ");
        quantity = scan.nextInt();

        if (productType == "1") {
            System.out.println("Enter storage temperature in Celsius degrees: ");
            storageTemp = scan.nextInt();
            productID = animalList.size() + vegetableProductList.size();
            AnimalProduct animal = new AnimalProduct(name, productID, price, validityDate, weight, quantity, storageTemp);
            animalList.add(animal);
            System.out.println(animal.getProductID());
        } else {
            System.out.println("Enter vitamin list: ");
            vitaminsList = scan.nextLine();
            productID = vegetableProductList.size() + animalList.size();
            VegetalProduct vegetable = new VegetalProduct(name, productID, price, validityDate, weight, quantity, vitaminsList);
            vegetableProductList.add(vegetable);
        }
    }

    /**
     * method to sell product base on the product ID and the amount of stock
     */

    private static void sellProduct() {
        System.out.println(" Please insert product Id");
        String id = scan.next();
        int quantity;
        int i = 0;

        for (Product x : animalList) {
            if (x.getProductID() == Integer.parseInt(id)) {
                System.out.println(" Please insert the quantity you want to sell");
                quantity = scan.nextInt();
                i = 1;
                if (quantity <= x.getQuantity()) {
                    x.setQuantity(x.getQuantity() - quantity);
                    sellListReport(x.getProductID(),quantity);
                } else {
                    System.out.println("Not enough stock!");
                }
            }
        }

        for (Product y : vegetableProductList) {
            if (y.getProductID() == Integer.parseInt(id)) {
                System.out.println(" Please insert the quantity you want to sell");
                quantity = scan.nextInt();
                i = 1;
                if (quantity <= y.getQuantity()) {
                    y.setQuantity(y.getQuantity() - quantity);
                    sellListReport(y.getProductID(),quantity);
                } else {
                    System.out.println("Not enough stock!!!");
                }
            }
        }

        if (i == 0) {
            System.out.println("Invalid selection");
            sellProduct();
        }
    }

    /**
     *
     */
    private static void addAvaialbleProducts() {
        AnimalProduct cheese = new AnimalProduct("cheese", 0, 8, "2020-12-02", 5, 150, 9);
        animalList.add(cheese);

        AnimalProduct egg = new AnimalProduct("egg", 1, 2, "2019-01-05.", 0.1, 2000, 5);
        animalList.add(egg);
        AnimalProduct yoghurt = new AnimalProduct("youghrt", 2,2.15, "2019-05-09", 30, 120,4);
        animalList.add(yoghurt);

        VegetalProduct cabbage = new VegetalProduct("cabbage",3 , 3, "2019-01-18", 0.5, 100, "C,A,K");
        vegetableProductList.add(cabbage);
        VegetalProduct carrot = new VegetalProduct("carrot",4,6, "2019-08-16", 36,78,"Vitamis B,K,A");
        vegetableProductList.add(carrot);
        VegetalProduct tomates = new VegetalProduct("tomates", 5, 7,"2019-08-26",20,540,"Vitamin C,magnezium,folic acid" );
        vegetableProductList.add(tomates);

    }

    /**
     * method to print list base on product name, Id and stock
     */
    private static void printList() {
        int i = 1;
        for (Product x : animalList) {
            System.out.println(i + ". " + x.getName() + " id " + x.getProductID() + " " + x.getQuantity());
            i++;
        }
        for (Product x : vegetableProductList) {
            System.out.println(i + ". " + x.getName() + " id " + x.getProductID() + " " + x.getQuantity());
            i++;
        }
    }

    /**
     * method to print the daily sales from the date you choose
     * @param id
     * @param qty
     */
    private static void sellListReport(int id, int qty){
        Product myProduct = new Product(id,qty);
        sellList.add(myProduct);
    }

    private static void showSellListRepot(){
        System.out.println("introduceti data in format YYYY-MM-DD");
        String date = scan.next();
        for (Product x : sellList){
            if (x.getSellDate().equals(LocalDate.parse(date)))
                System.out.println(x.getProductID()+" " + x.getQuantity());
        }
    }


}






