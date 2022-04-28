import java.io.Serializable;

public class Items implements Serializable{
    private int itemnumber;
    private String itemname;
    private int stock;

    public Items(int stocknumber, String name, int stock){
        this.itemnumber = stocknumber;
        this.itemname = name;
        this.stock = stock;
    }
    public String getItemname() {
        return itemname;
    }
    public int getItemnumber() {
        return itemnumber;
    }
    public int getStock() {
        return stock;
    }
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
