//Print sum of two numbers taken by the user.
import java.util.Scanner;
public class Second {
    public static void main(String [] args)
    {
        System.out.println("Sum of two numbers taken by the user is");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int c = a+b;
        System.out.print("The sum of two numbers is : ");
        System.out.println(c);
    }
}
