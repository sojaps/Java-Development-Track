import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        double bal;
        String fName;
        String lName;
        String str;
        String city;
        String st;
        String zip;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Personal Account\n2. Business Account");
        switch (Integer.parseInt(input.nextLine())) {
            case 1:
                bal = Double.parseDouble(input.nextLine());
                fName = input.nextLine();
                lName=input.nextLine();
                str = input.nextLine();
                city = input.nextLine();
                st = input.nextLine();
                zip = input.nextLine();
                PersonalAcct PersonalClient = new PersonalAcct(bal, fName, lName, str, city, st, zip);
                if (PersonalClient.getBalance()<100){
                    PersonalClient.withdrawal(2);
                }
                System.out.println ("Current Balance: " + PersonalClient.getBalance());
                break;
            case 2:
                bal = Double.parseDouble(input.nextLine());
                fName = input.nextLine();
                lName=input.nextLine();
                str = input.nextLine();
                city = input.nextLine();
                st = input.nextLine();
                zip = input.nextLine();
                BusinessAcct BusinessClient = new BusinessAcct(bal, fName, lName, str, city, st, zip);
                if (BusinessClient.getBalance()<500){
                    BusinessClient.withdrawal(10);
                }
                System.out.println ("Current Balance: " + BusinessClient.getBalance());
                break;
        }
        input.close();
   } 
}
