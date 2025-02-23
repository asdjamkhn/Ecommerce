package ecommerce.model;

import java.util.Date;
import java.util.List;

public class Orders {

    private int order_id;
    private String order_status;
    private int customer_id;
    private List<Order_Items> order_items;
    private Date createdDate;

    public Orders(int order_id, String order_status, int customer_id, List<Order_Items> order_items) {
        this.order_id = order_id;
        this.order_status = order_status;
        this.customer_id = customer_id;
        this.order_items = order_items;
    }

    public Orders(){

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public List<Order_Items> getOrder_items() {
        return order_items;
    }

    public void setOrder_items(List<Order_Items> order_items) {
        this.order_items = order_items;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + order_id +
                ", order_status='" + order_status + '\'' +
                ", customer_id=" + customer_id +
                ", orderItems=" + order_items +
                '}';
    }
}
