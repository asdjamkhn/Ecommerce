package ecommerce.service;

import ecommerce.dao.Order_ItemsDAO;

public class Order_ItemsService {

    Order_ItemsDAO orderItemsDAO = new Order_ItemsDAO();


    public void addOrderItems(int order_id, int product_id, int quantity){

        orderItemsDAO.addOrderItems(order_id,product_id,quantity);

    }
    public void updateOrderItems(int order_id, int product_id, int quantity){

        orderItemsDAO.updateOrderItems(order_id,product_id,quantity);
    }



}
