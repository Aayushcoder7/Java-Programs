//Write a program to take the name from the user and greets him.
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = sc.nextLine();
        System.out.println("Welcome " + str + ", Have a nice Day 😊");
    }
}
