package ecommerce.service;

import ecommerce.dao.ProductDAO;
import ecommerce.model.Product;

import java.util.List;
import java.util.Map;

public class ProductService {

    private ProductDAO productDAO = new ProductDAO();

    public void addProduct(String name, String desc, float price, int quantity, int categoryId){

        productDAO.addProduct(name,desc,price,quantity,categoryId);

    }
    public List<Product> getProduct(){
        return productDAO.getProducts();
    }

    public void updateProduct(String description, float price, int quantity, int prodId){
        productDAO.updateProduct(description,price,quantity,prodId);
    }

    public void deleteProduct(int prod_id){
        productDAO.deleteProduct(prod_id);

    }

    public List<Product> searchProducts(String prod_name, int categoryId){

       return productDAO.searchProducts(prod_name,categoryId);

    }

    public List<Map<String, Object>> topSellingProducts(){

        return productDAO.topSellingProducts();

    }

    public List<Map<String, Object>> productsInGivenCategory(String cat_name){

        return productDAO.productsInGivenCategory(cat_name);

    }


}
