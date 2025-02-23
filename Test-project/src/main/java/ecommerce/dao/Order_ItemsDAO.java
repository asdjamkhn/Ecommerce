package ecommerce.dao;

import ecommerce.databaseconfig.DatabaseConfig;
import ecommerce.model.Order_Items;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class Order_ItemsDAO {


    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();

    public void addOrderItems(int order_id, int product_id, int quantity) {

        String sql = "Insert into order_items(order_id, product_id, quantity) values (?,?,?)";

        int result = jdbcTemplate.update(sql, order_id, product_id, quantity);
        if (result > 0) {
            System.out.println("Order Items added suuccessfully");

        } else {
            System.out.println("Adding Order items failed");
        }

    }

    public void updateOrderItems(int order_id, int product_id, int quantity) {

        String sql = "update order_items set order_id = ?, product_id = ?, quantity = ?";

        int result = jdbcTemplate.update(sql, order_id, product_id, quantity);

        if (result > 0) {
            System.out.println("Order Items updated suuccessfully");

        } else {
            System.out.println("Updating Order items failed");
        }

    }

    public List<Map<String,Object>> getOrderItem(int order_item_id){

        String sql = "Select * from order_items where order_item_id = ?";

        return jdbcTemplate.queryForList(sql, order_item_id);

    }


}


//deleteProduct


//getCategories
//getCustomerByName
//updateCustomer







