

public class Food {
    private String name;
    private double price;
    private double fat;
    private double carb;
    private double fiber;
    private double total;

    public Food(String name, double price, int fat, int carb, int fiber) {
        this.name=name;
        this.price=price;
        this.fat = fat;
        this.carb=carb;
        this.fiber=fiber;    
    }
    public double getCarb() {
        return carb;
    }
    public String getName() {
        return name;
    }
    public double getFat() {
        return fat;
    }
    public double getFiber() {
        return fiber;
    }
    public double getPrice() {
        return price;
    }
    public void setTotal(int total) {
        this.total = total * this.price;
    }
    public double getTotal() {
        return total;
    }
}
