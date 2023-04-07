//Print 100 to 200
import java.util.Scanner;
public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
                int n = sc.nextInt();
                int i = 100;
                while(i<=n)
                {
                    System.out.printf("%d\t",i);
                    i++;
                }

    }
}
