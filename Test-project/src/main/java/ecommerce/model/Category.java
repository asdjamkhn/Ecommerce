package ecommerce.model;

public class Category {

    //data members
    private int cat_id;
    private String cat_name;
    private String cat_desc;

    //parameterised constructor
    public Category(int cat_id, String cat_name, String cat_desc) {
        this.cat_id = cat_id;
        this.cat_name = cat_name;
        this.cat_desc = cat_desc;
    }

    //default constructor
    public Category() {

    }

    //setters
    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public void setCat_desc(String cat_desc) {
        this.cat_desc = cat_desc;
    }

    //getters
    public int getCat_Id() {
        return this.cat_id;
    }

    public String getCat_Name() {
        return this.cat_name;
    }

    public String getCat_desc() {
        return this.cat_desc;
    }

    public String toString() {
        return "Category{" +
                "Cat_Id=" + cat_id +
                ", Cat_Name='" + cat_name + '\'' +
                ", CAt_Desc='" + cat_desc + '\'' +
                '}';


    }
}
