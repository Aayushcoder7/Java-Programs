//Print first 10 odd numbers in ascending order.
import java.util.Scanner;
public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
//        int a=((2*n)-1);
        for(int i = 0; i < n ; i++)
        {
            System.out.print((2*i + 1)+" ");   //For even no. : 2*i
        }
    }
}
