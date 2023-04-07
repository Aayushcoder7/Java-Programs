import java.util.Scanner;
public class Practice13_6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Website url");
        String str = sc.next();
        if(str.endsWith(".com"))
        {
            System.out.println("This is a Commercial Website.");
        }
        else if(str.endsWith(".org"))
        {
            System.out.println("This is a Organizational Website.");
        }
        else if(str.endsWith(".in"))
        {
            System.out.println("This is a Indian Website.");
        }
        else
        {
            System.out.println("Sorry! Please Entered the correct Website.");
        }
    }
}
