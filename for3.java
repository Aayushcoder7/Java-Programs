//Print first 10 odd numbers in descending order.
import java.util.Scanner;
public class for3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print((2 * i - 1) + " ");  // For even : 2*i
        }
    }
}