package ecommerce.service;

import ecommerce.dao.CustomerDAO;
import ecommerce.model.Customer;

import java.util.List;

public class CustomerService {

    CustomerDAO customerDAO = new CustomerDAO();

    public void addCustomers(String cust_name, String cust_address, int cust_phone){

        customerDAO.addCustomers(cust_name,cust_address,cust_phone);

    }

    public List<Customer> getCustomers(){
        return customerDAO.getCustomers();
    }


    public void getCustomerByName(String cust_name){

        customerDAO.getCustomerByName(cust_name);

    }

    public void updateCustomer(String cust_address, int cust_id){

        customerDAO.updateCustomer(cust_address,cust_id);
    }
    public void deleteCustomer(){

        customerDAO.deleteCustomer();
    }

}
