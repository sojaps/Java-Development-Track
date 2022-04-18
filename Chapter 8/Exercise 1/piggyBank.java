import java.lang.reflect.Constructor;

public class piggyBank {

    private int penny=0;
    private int nickel=0;
    private int dime=0;
    private int quarter=0; 
    private double total = 0;

    public void piggyBank() {
    }
    public void setDime(int dime) {
        this.dime = dime;
    }
    public void setPenny(int penny) {
        this.penny = penny;
    }
    public void setNickel(int nickel) {
        this.nickel = nickel;
    }
    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void addTotal() {
        this.total = (this.penny*0.01) + (this.nickel*0.05) + (this.dime*0.1) + (this.quarter*0.25);
        /*
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;
        */
    }
    public int getDime() {
        return dime;
    }
    public int getNickel() {
        return nickel;
    }
    public int getPenny() {
        return penny;
    }
    public int getQuarter() {
        return quarter;
    }
    public double getTotal() {
        return total;
    }
}
