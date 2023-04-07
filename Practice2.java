//Write a program to calculate CGPA of three subjects out of 100.
import java.util.Scanner;
public class Practice2 {
    public static void main( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1");
        int sub1 = sc.nextInt();
        System.out.println("Enter Marks of Subject 2");
        int sub2 = sc.nextInt();
        System.out.println("Enter Marks of Subject 3");
        int sub3 = sc.nextInt();
        int total = ( sub1 + sub2 + sub3) /3;
        System.out.println("Your CPGA is : " + total);
    }
}
