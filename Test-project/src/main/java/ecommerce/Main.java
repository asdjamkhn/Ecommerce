package ecommerce;

import ecommerce.Menu.CategoryMenu;
import ecommerce.Menu.CustomerMenu;
import ecommerce.Menu.OrderMenu;
import ecommerce.Menu.ProductMenu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello");

        CategoryMenu categoryMenu = new CategoryMenu();
        ProductMenu productMenu = new ProductMenu();
        CustomerMenu customerMenu = new CustomerMenu();
        OrderMenu orderMenu = new OrderMenu();


        while (true) {
            System.out.println("Welcome to the E-commerce Inventory Management System's Menu ");
            System.out.println("Please select the following options");
            System.out.println("1. Category Management:");
            System.out.println("2. Product Management:");
            System.out.println("3. Order Management:");
            System.out.println("4. Customer Management:");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    categoryMenu.showSubMenu();
                    break;
                case 2:
                    productMenu.showSubMenu();
                    break;
                case 3:
                    orderMenu.showSubMenu();
                    break;
                case 4:
                    customerMenu.showSubMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}

