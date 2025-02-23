package ecommerce.dao;

import ecommerce.databaseconfig.DatabaseConfig;
import ecommerce.model.Order_Items;
import ecommerce.model.Orders;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class OrderDAO {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();


    public void createOrder(int customerId, List<Order_Items> order_items) {

        String sql = "Insert into Orders (customer_id, order_status) values (?, 'Pending') ";
        jdbcTemplate.update(sql, customerId);

        String sql1 = "Select Max(order_id) from Orders where customer_id = ?";
        int orderId = jdbcTemplate.queryForObject(sql1, Integer.class, customerId); //??????Integer Class

        String sql2 = "Insert into order_items(order_id, product_id, quantity)values(?,?,?)";
        for (Order_Items item : order_items) {
            jdbcTemplate.update(sql2, orderId, item.getProduct_id(), item.getQuantity());
        }
        System.out.println("Order created successfully with ID: " +  orderId);

    }
    // #Generate a report of all orders within a specific date range.

    public void orderWithinSpecificDate(String date1, String date2) {

        String sql = "Select * from orders where date_created between ? and ?";

        System.out.println(jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Orders.class), date1, date2));

    }

    public List<Orders> orderWithinSpecificDate1(String date1, String date2) {

        String sql = "Select * from orders where date_created between ? and ?";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Orders.class), date1, date2);

    }
    public List<Map<String, Object>> orderWithinSpecificDate2(String date1, String date2) {

        String sql = "Select * from orders where date_created between ? and ?";

        return jdbcTemplate.queryForList(sql,date1, date2);

    }

    public void deleteOrder(int order_id){

        String sql = "delete from Orders where order_id = ?";
        int result = jdbcTemplate.update(sql,order_id);
        if (result>0){
            System.out.println("Order deleted successfully");
        }else{
            System.out.println("Order failed to delete");
        }
    }

    public void updateOrder(int order_id ,String order_status){

        String sql = "Update Orders set order_status = ? where order_id = ? ";
        int result = jdbcTemplate.update(sql,order_status, order_id);
        if (result>0){
            System.out.println("Order updated successfully");
        }else{
            System.out.println("Order failed to update");
        }
    }



}



