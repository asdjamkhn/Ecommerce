package ecommerce.model;

public class Product {

    //Data members


    private int prod_id;
    private String prod_name;
    private String prod_desc;
    private float prod_price;
    private int prod_quant;
    private int category_id;


    public Product(){

    }

    public Product(int prod_id, String prod_name, String prod_desc, float prod_price, int prod_quant, int category_id) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_desc = prod_desc;
        this.prod_price = prod_price;
        this.prod_quant = prod_quant;
        this.category_id = category_id;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_desc() {
        return prod_desc;
    }

    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }

    public float getProd_price() {
        return prod_price;
    }

    public void setProd_price(float prod_price) {
        this.prod_price = prod_price;
    }

    public int getProd_quant() {
        return prod_quant;
    }

    public void setProd_quant(int prod_quant) {
        this.prod_quant = prod_quant;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prod_id=" + prod_id +
                ", prod_name='" + prod_name + '\'' +
                ", prod_desc='" + prod_desc + '\'' +
                ", prod_price=" + prod_price +
                ", prod_quant=" + prod_quant +
                ", category_id=" + category_id +
                '}';
    }
}

