package ecommerce.service;

import ecommerce.dao.OrderDAO;
import ecommerce.model.Order_Items;
import ecommerce.model.Orders;

import java.util.List;

public class OrderService {
    OrderDAO orderDAO = new OrderDAO();

    public void createOrder(int customerId, List<Order_Items> order_items) {

        orderDAO.createOrder(customerId, order_items);

    }
    public List<Orders> orderWithinSpecificDate1(String date1, String date2) {
        return orderDAO.orderWithinSpecificDate1(date1,date2);
    }

    public void deleteOrder(int order_id){

        orderDAO.deleteOrder(order_id);

    }

    public void updateOrder(int order_id ,String order_status){

        orderDAO.updateOrder(order_id,order_status);

    }

}
