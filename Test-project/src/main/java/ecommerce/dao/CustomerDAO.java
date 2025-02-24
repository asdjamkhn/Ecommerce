package ecommerce.dao;

import ecommerce.databaseconfig.DatabaseConfig;
import ecommerce.model.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CustomerDAO {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();

    public void addCustomers(String cust_name, String cust_address, int cust_phone) {

        String sql = "Insert into Customer (cust_name, cust_address, cust_phone) Values(?,?,?)";
        int result = jdbcTemplate.update(sql, cust_name, cust_address, cust_phone);
        if (result > 0) {
            System.out.println("Customers added successfully");
        } else {
            System.out.println("Customers insertion failed");

        }
    }

    public List<Customer> getCustomers() {
        String sql = "Select * from Customer";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class));

    }

    public void getCustomerByName(String cust_name) {

        String sql = "select * from customer where cust_name = ?";

        System.out.println(jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class), cust_name));

    }

    public void updateCustomer(String cust_address, int cust_id) {

        String sql = "Update Customer set cust_address = ? where cust_id = ? ";
        int result = jdbcTemplate.update(sql, cust_address, cust_id);
        if (result > 0) {

            System.out.println("Customer's address updated successfully");
        } else {
            System.out.println("Updating customer's address failed");
        }
    }

    public void deleteCustomer(int cust_id) {

        String sql = "delete from customer where cust_id = ?";
        int result = jdbcTemplate.update(sql, cust_id);
        if (result > 0) {
            System.out.println("Customer deleted");

        } else {
            System.out.println("Customer deletetion unsuccessful");

        }

    }

}
