import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        word = input.nextLine();
        word = word.replaceAll("[^a-zA-Z]", "");
        char[] ch=word.toCharArray();
        int length = ch.length;
        char[] word2 = new char[length];
        for (char c : ch) {
            length--;
            word2[length]=c;
        }
        if (String.valueOf(ch).equals(String.valueOf(word2))) {
            System.out.println("Palindrome");            
        }
        else{
            System.out.println("Not a palindrome");
        }
        input.close();
    }
}