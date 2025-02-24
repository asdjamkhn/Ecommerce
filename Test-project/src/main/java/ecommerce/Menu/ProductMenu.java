package ecommerce.Menu;

import ecommerce.service.ProductService;

import java.util.Scanner;

public class ProductMenu implements SubMenu {

    ProductService productService = new ProductService();

    @Override
    public void showSubMenu() {
        while (true) {

            System.out.println("Welcome to the Product Menu");
            System.out.println("Please select the following options");
            System.out.println("1. Add Product:");
            System.out.println("2. Get Products:");
            System.out.println("3. Search Products:");
            System.out.println("4. Update Products:");
            System.out.println("5. Delete Products:");
            System.out.println("6. Top Selling Products:");
            System.out.println("7. Products In Given Category:");
            System.out.println("8. Exit");

            System.out.println("Please enter your choice");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Please enter the name:");
                    Scanner name = new Scanner(System.in);
                    String productName = name.nextLine();

                    System.out.println("Please enter the description:");
                    Scanner desc = new Scanner(System.in);
                    String productDesc = desc.nextLine();

                    System.out.println("Please enter the Price:");
                    Scanner price = new Scanner(System.in);
                    int prodPrice = price.nextInt();

                    System.out.println("Please enter the Quantity:");
                    Scanner quant = new Scanner(System.in);
                    int productQuantity = quant.nextInt();

                    System.out.println("Please enter the Category ID:");
                    Scanner Id = new Scanner(System.in);
                    int categoryId = Id.nextInt();

                    productService.addProduct(productName, productDesc, prodPrice, productQuantity, categoryId);

                    break;

                case 2:

                    System.out.println(productService.getProduct());

                    break;

                case 3:

                    System.out.println("Please enter the product name");
                    Scanner prodName = new Scanner(System.in);
                    String productName1 = prodName.nextLine();

                    System.out.println("Please enter the category ID");
                    Scanner Id1 = new Scanner(System.in);
                    int categoryId1 = Id1.nextInt();

                    System.out.println(productService.searchProducts(productName1, categoryId1));

                    break;

                case 4:

                    System.out.println("Please enter the description:");
                    Scanner desc1 = new Scanner(System.in);
                    String productDesc1 = desc1.nextLine();

                    System.out.println("Please enter the Price:");
                    Scanner price1 = new Scanner(System.in);
                    int prodPrice1 = price1.nextInt();

                    System.out.println("Please enter the Quantity:");
                    Scanner quant1 = new Scanner(System.in);
                    int productQuantity1 = quant1.nextInt();

                    System.out.println("Please enter the Product ID");
                    Scanner prodID = new Scanner(System.in);
                    int productID = prodID.nextInt();

                    productService.updateProduct(productDesc1, prodPrice1, productQuantity1, productID);

                case 5:

                    System.out.println("Please enter the Product ID");
                    Scanner prodID1 = new Scanner(System.in);
                    int productID1 = prodID1.nextInt();

                    productService.deleteProduct(productID1);

                    break;

                case 6:

                    System.out.println(productService.topSellingProducts());

                    break;

                case 7:

                    System.out.println("Please enter the category name");

                    Scanner name2 = new Scanner(System.in);
                    String catName = name2.nextLine();
                    System.out.println(productService.productsInGivenCategory(catName));

                    break;
                case 8:

                    return;

                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
