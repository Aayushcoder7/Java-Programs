//Increment Decrement
import java.util.Scanner;
public class Practice7 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
                int x=7;
                int y=++x;
        System.out.println(y);

        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println(++a);
        System.out.println(a);


        char ch = 'X';
        System.out.println(ch);
        System.out.println(++ch);
    }
}
