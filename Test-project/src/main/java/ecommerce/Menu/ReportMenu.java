package ecommerce.Menu;

import ecommerce.service.OrderService;
import ecommerce.service.ProductService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class ReportMenu implements SubMenu {

    ProductService productService = new ProductService();
    OrderService orderService = new OrderService();

    @Override
    public void showSubMenu () {


        while (true) {

            System.out.println("Welcome to the Report Menu");
            System.out.println("Please select the following options");
            System.out.println("1. Top Selling Products:");
            System.out.println("2. Products In Given Category:");
            System.out.println("3. Order With in Specific Date:");

            System.out.println("Please enter your choice");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            switch (menu) {

                case 1:


                        File file = new File("Files/Reports.txt");
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        FileWriter fileWriter = new FileWriter("Files/Reports.txt");
                        fileWriter.write("Welcome to Reports. \n Report for Top selling Products.");
                        fileWriter.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        FileWriter fileWriter = new FileWriter("Files/Reports.txt");
                        fileWriter.write(productService.topSellingProducts().toString());
                        fileWriter.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(productService.topSellingProducts());

                    break;

                case 2:

                    System.out.println("Please enter the category name");

                    Scanner name2 = new Scanner(System.in);
                    String catName = name2.nextLine();


                    try {
                        FileWriter fileWriter = new FileWriter("Files/Reports.txt");
                        fileWriter.write(productService.productsInGivenCategory(catName).toString());
                        fileWriter.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(productService.productsInGivenCategory(catName));


                    break;

                case 3:

                    System.out.println("Please enter the first date");
                    Scanner date = new Scanner(in);
                    String date1 = date.nextLine();

                    System.out.println("Please enter the second date");
                    Scanner datee = new Scanner(in);
                    String date2 = datee.nextLine();

                    
                    orderService.orderWithinSpecificDate(date1, date2);

                    break;

                case 4:

                    return;

                default:
                    System.out.println("Invalid input");


            }

        }

    }

}
