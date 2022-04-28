import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Inventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int exit =0;
        int choice;
        ArrayList<Items> inventory = new ArrayList<Items>();
        int itemnumber;
        String itemname;
        File file = new File("Inventory-list");
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        int initialstock;
        do {
            System.out.println("\n\n\n[1] Add an item\n[2] Discontinue item\n[3] Display stock for an item\n[4] Create file\n[0] Exit\n");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("\nEnter name of item: ");
                    itemname = input.nextLine();
                    System.out.print("Enter initial stock: ");
                    initialstock = Integer.parseInt(input.nextLine());
                    Items item = new Items(inventory.size()+1000-1, itemname, initialstock);
                    inventory.add(item);
                    System.out.printf("Stock number: %d\n", inventory.size()+1000-1);
                    System.out.println("Item name: "+itemname);
                    System.out.println("Initial stock: "+initialstock);
                    break;
                case 2:
                    System.out.print("\nEnter stock number to discontinue: ");
                    itemnumber = Integer.parseInt(input.nextLine());
                    inventory.get(itemnumber-1000).setItemname("discontinued");
                    inventory.get(itemnumber-1000).setStock(0);
                    System.out.print("Success!");
                    break;
                case 3:
                    System.out.print("\nEnter stock number to check stock: ");
                    itemnumber = Integer.parseInt(input.nextLine());
                    System.out.println("\n\nStock number: "+itemnumber);
                    System.out.println("Item name: "+inventory.get(itemnumber -1000).getItemname());
                    System.out.println("Item stock: "+inventory.get(itemnumber-1000).getStock());
                    break;
                case 4:
                try {
                    fileOutputStream = new FileOutputStream(file);
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(inventory);
                    System.out.println("File created");
                } catch (Exception e) {
                    //TODO: handle exception
                }
                    break;
                case 0:
                    exit = 1;
            }
        } while (exit == 0);
        input.close();
    }  
}