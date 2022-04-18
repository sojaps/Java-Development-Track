import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        int choice;
        int amount;
        piggyBank piggyBank = new piggyBank();
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("1. Show total in bank. \n2. Add a Penny. \n3. Add a nickel \n4. Add a dime\n5. Add a quarter\n6. Take money out of bank.\nEnter 0 to quit\nEnter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Total amount is "+piggyBank.getTotal());
                    break;
                case 2:
                    System.out.print("Enter amount of penny(s) to add: ");
                    amount = Integer.parseInt(input.nextLine());
                    piggyBank.setPenny(piggyBank.getPenny()+amount);
                    System.out.print(piggyBank.getPenny());
                    piggyBank.addTotal();
                    System.out.println("Success\n");
                    break;
                case 3:
                    System.out.print("Enter amount of nickel(s) to add: ");
                    piggyBank.setNickel(piggyBank.getNickel()+Integer.parseInt(input.nextLine()));
                    piggyBank.addTotal();
                    System.out.println("Done");
                    break;
                case 4:
                    System.out.print("Enter amount of dime(s) to add: ");
                    piggyBank.setDime(piggyBank.getDime()+Integer.parseInt(input.nextLine()));
                    piggyBank.addTotal();
                    break;
                case 5:
                    System.out.print("Enter amount of quarter(s) to add: ");
                    piggyBank.setQuarter(piggyBank.getQuarter()+Integer.parseInt(input.nextLine()));
                    piggyBank.addTotal();
                    break;
                case 6:
                    System.out.print("Enter amount to take out: ");
                    amount= Integer.parseInt(input.nextLine());
                    if(amount<=piggyBank.getTotal()){
                        piggyBank.setTotal(piggyBank.getTotal()-amount);
                    }
                    System.out.println("Done");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (choice!=0);
       
        input.close();
    }
    
}