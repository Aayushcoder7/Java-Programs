//Take a number from the user and print it.
import java.util.Scanner;
public class while1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i=1;
       while(i<=n)
        {
            System.out.printf("%d\t",i);
            i++;
        }
    }
}
