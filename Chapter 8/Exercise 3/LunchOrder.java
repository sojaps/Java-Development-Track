import java.util.Scanner;
/**
 * LunchOrder
 */
public class LunchOrder {
    public static void main(String[] args) {
        double TotalPrice;
        Food hamburger = new Food("hamburger",1.85,9,33,1);
        Food salad = new Food("salad", 2.00, 1, 11, 5);
        Food frenchfries = new Food("french fries", 1.30, 11, 36, 4);
        Food soda = new Food("soda", 0.95, 0, 38, 0);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of hamburgers: ");
        hamburger.setTotal(Integer.parseInt(input.nextLine()));
        System.out.printf("Each hamburger has %.1fg of fat, %.1fg of carbs, and %.1fg of fiber.\n\n",hamburger.getFat(),hamburger.getCarb(),hamburger.getFiber());
        
        System.out.print("Enter number of salads: ");
        salad.setTotal(Integer.parseInt(input.nextLine()));
        System.out.printf("Each salad has %.1fg of fat, %.1fg of carbs, and %.1fg of fiber.\n\n",salad.getFat(),salad.getCarb(),salad.getFiber());

        System.out.print("Enter number of fries: ");
        frenchfries.setTotal(Integer.parseInt(input.nextLine()));
        System.out.printf("French fries have %.1fg of fat, %.1fg of carbs, and %.1fg of fiber.\n\n",frenchfries.getFat(),frenchfries.getCarb(),frenchfries.getFiber());
        
        System.out.print("Enter number of sodas: ");
        soda.setTotal(Integer.parseInt(input.nextLine()));
        System.out.printf("Each soda has %.1fg of fat, %.1fg of carbs, and %.1fg of fiber.\n\n",soda.getFat(),soda.getCarb(),soda.getFiber());

        TotalPrice = hamburger.getTotal()+salad.getTotal()+frenchfries.getTotal()+soda.getTotal();
        System.out.printf("Your order comes to: %.2f",TotalPrice);
        input.close();
    }
}