package ecommerce.model;

public class Order_Items {


    private int product_id;
    private int quantity;

    public Order_Items(int product_id, int quantity) {

        this.product_id = product_id;
        this.quantity = quantity;
    }
    public Order_Items(){

    }


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order_Items{" +
                " product_id=" + product_id +
                ", quantity=" + quantity +
                '}';
    }
}
