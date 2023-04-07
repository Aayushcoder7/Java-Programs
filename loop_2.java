import java.util.Scanner;
public class loop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int Sum=0;
        int i =0;
        while (i<n)
        {
            Sum = Sum + 2*i;
            i++;
        }
        System.out.println(" total Sum is :"+Sum);
    }
}
