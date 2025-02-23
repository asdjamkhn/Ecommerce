package ecommerce.Menu;

import ecommerce.model.Order_Items;
import ecommerce.service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class OrderMenu implements SubMenu {

    OrderService orderService = new OrderService();

    @Override
    public void showSubMenu() {
        while (true) {

            System.out.println("Welcome to the Order Menu");
            System.out.println("Please select the following options");
            System.out.println("1. Create Order:");
            System.out.println("2. Order With in Specific Date:");
            System.out.println("3. Delete Order:");
            System.out.println("4. Update Order:");
            System.out.println("5. Exit");

            System.out.println("Please enter your choice");
            Scanner scanner = new Scanner(in);
            int menu = scanner.nextInt();

            switch (menu) {

                case 1:

                    List<Order_Items> order_items = new ArrayList<>();

                    System.out.println("Please enter the Customer ID:");
                    Scanner ID1 = new Scanner(in);
                    int customerId = ID1.nextInt();

                    while (true) {

                        System.out.println("Please enter the Product ID(Or press -1 to Exit):");
                        Scanner ID = new Scanner(in);
                        int productId = ID.nextInt();

                        if (productId == -1) {
                            break;
                        }
                        System.out.println("Please enter the Quantity:");
                        Scanner quant = new Scanner(in);
                        int quantity = quant.nextInt();

                        order_items.add(new Order_Items(productId, quantity));
                    }
                    orderService.createOrder(customerId, order_items);

                    break;

                case 2:

                    System.out.println("Please enter the first date");
                    Scanner date = new Scanner(in);
                    String date1 = date.nextLine();

                    System.out.println("Please enter the second date");
                    Scanner datee = new Scanner(in);
                    String date2 = datee.nextLine();

                    orderService.orderWithinSpecificDate(date1, date2);

                    break;

                case 3:
                    System.out.println("Please enter Order ID");
                    Scanner IDD = new Scanner(in);
                    int orderID = IDD.nextInt();

                    orderService.deleteOrder(orderID);

                    break;

                case 4:

                    System.out.println("Please enter Order status");
                    Scanner status = new Scanner(in);
                    String orderStatus = status.nextLine();

                    System.out.println("Please enter Order ID");
                    Scanner IDDD = new Scanner(in);
                    int orderIDD = IDDD.nextInt();

                    orderService.updateOrder(orderIDD, orderStatus);

                    break;

                case 5:

                default:
                    System.out.println("Invalid Input");


            }

        }

    }


}
