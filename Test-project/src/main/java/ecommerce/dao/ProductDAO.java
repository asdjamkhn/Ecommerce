package ecommerce.dao;

import ecommerce.databaseconfig.DatabaseConfig;
import ecommerce.model.Product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class ProductDAO {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();

    public void addProduct(String name, String desc, float price, int quantity, int categoryId) {
        String sql = "Insert into Product (prod_name, prod_desc, prod_price, prod_quant, category_id) values (?,?,?,?,?)";
        int result = jdbcTemplate.update(sql, name, desc, price, quantity, categoryId);
        if (result > 0) {
            System.out.println("Values added successfully");
        } else {
            System.out.println("Values insertion failed");
        }
    }

    public List<Product> getProducts() {
        String sql = "Select * from Product";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class));
    }

    public List<Product> searchProducts(String prod_name, int categoryId) {

        String sql = "select * from product where prod_name = ? or category_id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class), prod_name, categoryId);

    }

    public void updateProduct(String description, float price, int quantity, int prodId) {

        String sql = "Update Product set prod_desc = ?, prod_price = ?, prod_quant = ? where prod_id = ? ";
        int result = jdbcTemplate.update(sql, description, price, quantity, prodId);
        if (result > 0) {
            System.out.println("Values updated successfully");
        } else {
            System.out.println("Values failed to update");
        }
    }

    public void deleteProduct(int prod_id) {

        String sql = "delete from Product where prod_id = ?";
        int result = jdbcTemplate.update(sql, prod_id);
        if (result > 0) {
            System.out.println("Values deleted successfully");
        } else {
            System.out.println("Values failed to delete");
        }
    }

    public List<Map<String, Object>> topSellingProducts() {

        String sql = "Select p.prod_id,p.prod_name, p.prod_price,sum(oi.quantity)as sum," +
                " sum(oi.quantity*p.prod_price)as total_cost \n" +
                "from order_items as oi \n" +
                "left join product as p on oi.product_id = p.prod_id \n" +
                "group by oi.product_id order by sum desc;";

        return jdbcTemplate.queryForList(sql);

    }

    public List<Map<String, Object>> productsInGivenCategory(String cat_name) {

        String sql = "Select p.prod_id, p.prod_name, p.prod_price, p.prod_quant, c.cat_name from " +
                "Product as p \n" +
                "left join category as c on p.category_id = c.cat_id where c.cat_name = ?";

        return jdbcTemplate.queryForList(sql, cat_name);

    }

}
