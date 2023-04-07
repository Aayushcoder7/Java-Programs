//print 1 to 10 in decrement order and use break statement in Do While loop.
import java.util.Scanner;
public class break3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 10;
        do
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
            i--;
        }
        while (i>=n);
    }
}
