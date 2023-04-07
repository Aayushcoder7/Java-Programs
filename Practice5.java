//Check whether the number entered by the user is integer or not.
import java.util.Scanner;
public class Practice5 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        boolean num = sc.hasNextInt();
        System.out.println(num);
    }
}
