package ecommerce.dao;

import ecommerce.databaseconfig.DatabaseConfig;
import ecommerce.model.Category;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CategoryDAO {

    private final JdbcTemplate jdbcTemplate = DatabaseConfig.getJdbcTemplate();

    public void addCategory(String name, String description) {
        String sql = "Insert into Category (cat_name, cat_desc) values (?, ?)";
        int result = jdbcTemplate.update(sql, name, description);
        if (result > 0) {
            System.out.println("Values added successfully");
        } else {
            System.out.println("Values insertion failed");
        }
    }

    public List<Category> getCategories() {
        String sql = "Select * from Category";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Category.class));
    }

}
