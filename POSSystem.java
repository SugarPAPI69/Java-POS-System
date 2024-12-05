import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class POSSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;
        int adchoice;
        String pName;
        float pPrice;
        int quan;
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Float> productPrices = new ArrayList<>();
        ArrayList<Integer> productStocks = new ArrayList<>();

        while (true) {
            System.out.println("POS Menu: 1. Admin 2. Customer 0. Exit");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();
            scn.nextLine(); 
            if (choice == 1) {
                    while (true) {
                    System.out.println("\nWelcome Admin");
                    System.out.println("POS Admin Menu:");
                    System.out.println("1. Add Product");
                    System.out.println("2. Update Price");
                    System.out.println("3. Update Stock");
                    System.out.println("4. View Produc list Report");
                    System.out.println("0. Back to Main Menu");
                    System.out.print("Enter your choice: ");
                    adchoice = scn.nextInt();
                    scn.nextLine(); 

                    switch (adchoice) {
                        case 1:
                            System.out.println("Adding a product...");
                            System.out.print("Enter Product Name: ");
                            pName = scn.nextLine();
                            System.out.print("Enter Product Price: ");
                            pPrice = scn.nextFloat();
                            System.out.print("Enter Stock Quantity: ");
                            quan = scn.nextInt();
                            scn.nextLine(); 

                            
                            productNames.add(pName);
                            productPrices.add(pPrice);
                            productStocks.add(quan);

                            System.out.println("Product added: " + pName + ", Price: " + pPrice + ", Quantity: " + quan);
                            break;

                        case 2:
                            System.out.println("Updating product price...");
                           
                            for (int i = 0; i < productNames.size(); i++) {
                                System.out.println((i + 1) + ". " + productNames.get(i) + " ($)" + productPrices.get(i) );
                            }
                            System.out.print("Enter product number to update price: ");
                            int productIndexPrice = scn.nextInt() - 1; 

                            if (productIndexPrice >= 0 && productIndexPrice < productNames.size()) {
                                System.out.print("Enter new price for " + productNames.get(productIndexPrice) + ": ");
                                float newPrice = scn.nextFloat();
                                productPrices.set(productIndexPrice, newPrice);
                                System.out.println("Price updated successfully!");
                            } else {
                                System.out.println("Invalid product number.");
                            }
                            break;

                        case 3:
                            System.out.println("Updating product stock...");
                           
                            for (int i = 0; i < productNames.size(); i++) {
                                System.out.println((i + 1) + ". " + productNames.get(i) + " ($" + productPrices.get(i) + ") - Quantity: " + productStocks.get(i));
                            }
                            System.out.print("Enter product number to update stock: ");
                            int productIndexStock = scn.nextInt() - 1; 
                            if (productIndexStock >= 0 && productIndexStock < productNames.size()) {
                                System.out.print("Enter new stock quantity for " + productNames.get(productIndexStock) + ": ");
                                int newStock = scn.nextInt();
                                productStocks.set(productIndexStock, newStock);
                                System.out.println("Stock updated successfully!");
                            } else {
                                System.out.println("Invalid product number.");
                            }
                            break;

                        case 4:
                            System.out.println("sales report Logic not yet implemented ...");
                            System.out.println("Total sales breakdown: ");
                                for (int i = 0; i < productNames.size(); i++) {
                                System.out.println((i + 1) + ". " + productNames.get(i) + " ($" + productPrices.get(i) + ") - Quantity: " + productStocks.get(i));
                            }
                                  break;
                            
                        case 0:
                            System.out.println("Returning to main menu...");
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }

                    if (adchoice == 0) break;
                }
            } else if (choice == 2) {
                               System.out.println("Customer functionality is not yet implemented.");
            } else if (choice == 0) {
                System.out.println("Exiting POS System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scn.close();
    }
}
