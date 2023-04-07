//Write a program to sum three numbers in java.
import java.util.Scanner;
public class Practice1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        byte num1 = sc.nextByte();
        System.out.println("Enter Second Number");
        byte num2 = sc.nextByte();
        System.out.println("Enter Third Number");
        byte num3 = sc.nextByte();
        int total = num1 + num2 + num3;
        System.out.println("Sum of Three Numbers is : "+total);
    }
}
