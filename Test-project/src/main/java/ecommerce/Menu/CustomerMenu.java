package ecommerce.Menu;

import ecommerce.service.CustomerService;

import java.util.Scanner;

public class CustomerMenu implements SubMenu {
    @Override
    public void showSubMenu() {

        CustomerService customerService = new CustomerService();

        while (true) {

            System.out.println("Welcome to the Customer Menu");
            System.out.println("Please select the following options");
            System.out.println("1. Add Customers:");
            System.out.println("2. Get Customers:");
            System.out.println("3. Get Customer by name:");
            System.out.println("4. Update Customers:");
            System.out.println("5. Delete Customers:");
            System.out.println("6. Exit");

            System.out.println("Please enter your choice");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            switch (menu) {

                case 1:

                    System.out.println("Please enter the Customer's name");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();

                    System.out.println("Please enter Customer's address");
                    Scanner scanner2 = new Scanner(System.in);
                    String address = scanner2.nextLine();

                    System.out.println("Please enter Customer's phone number");
                    Scanner scanner3 = new Scanner(System.in);
                    int phone = scanner3.nextInt();

                    customerService.addCustomers(name, address, phone);

                    break;

                case 2:

                    System.out.println(customerService.getCustomers());

                    break;

                case 3:

                    System.out.println("Please enter the Customer's name");
                    Scanner scanner4 = new Scanner(System.in);
                    String name1 = scanner4.nextLine();

                    customerService.getCustomerByName(name1);

                    break;

                case 4:

                    System.out.println("Please enter Customer's address");
                    Scanner scanner5 = new Scanner(System.in);
                    String address1 = scanner5.nextLine();

                    System.out.println("Please enter Customer's ID");
                    Scanner scanner6 = new Scanner(System.in);
                    int id = scanner6.nextInt();

                    customerService.updateCustomer(address1, id);

                    break;

                case 5:
                    System.out.println("Please enter Customer's ID");
                    Scanner scanner7 = new Scanner(System.in);
                    int id1 = scanner7.nextInt();

                    customerService.deleteCustomer(id1);

                    break;

                case 6:

                    return;

                default:

                    System.out.println("Invalid input");

            }
        }
    }
}
