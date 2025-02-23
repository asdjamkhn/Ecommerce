package ecommerce.service;

import ecommerce.dao.CategoryDAO;
import ecommerce.model.Category;

import java.util.List;

public class CategoryService {

    private CategoryDAO categoryDAO = new CategoryDAO();

    public void addCategory(String name, String description) {
        categoryDAO.addCategory(name, description);
    }

    public List<Category> getCatogeries() {
        return categoryDAO.getCategories();
    }

}

