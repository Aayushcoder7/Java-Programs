//Check whether the given number is greater than the entered number.
import java.util.Scanner;
public class Practice10 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num = 61;
        System.out.print("Enter your Number : ");
        byte b = sc.nextByte();
        System.out.println("Your entered number is " + b);
        System.out.print("As " + num + " is smaller than the "+ b);
        System.out.print(",Therefore ");
        System.out.println(b>num);
        System.out.print("As " + num + " is greater than the "+ b);
        System.out.print(",Therefore ");
        System.out.println(b<num);
    }
}
