import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Faculty Employee1 = new Faculty();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        Employee1.SetEmpName(input.nextLine());
        System.out.print("Enter Salary:");
        Employee1.setSalary(Integer.parseInt(input.nextLine()));
        System.out.print("Enter Department: ");
        Employee1.setDept(input.nextLine());
        System.out.println("I'm "+Employee1.EmpName+" with a salary of "+Employee1.Salary+" I work at the "+Employee1.Dept+ " department");
        input.close();
    }
}
