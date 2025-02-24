package ecommerce.Menu;

import ecommerce.service.CategoryService;

import java.util.Scanner;

public class CategoryMenu implements SubMenu {

    CategoryService categoryService = new CategoryService();

    @Override
    public void showSubMenu() {
        while (true) {

            System.out.println("Welcome to the Category Menu");
            System.out.println("Please select the following options");
            System.out.println("1. Add Category:");
            System.out.println("2. Get Categories:");
            System.out.println("3. Exit");

            System.out.println("Please enter your choice");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Please enter the name");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.nextLine();
                    System.out.println("Please enter the description");
                    Scanner scanner2 = new Scanner(System.in);
                    String desc = scanner2.nextLine();

                    categoryService.addCategory(name, desc);
                    break;
                case 2:
                    System.out.println(categoryService.getCatogeries());
                    break;
                case 3:

                    return;

                default:
                    System.out.println("Invalid input");

            }
        }
    }
}
