import java.util.*;
public class loop_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int mul=1;
        for(int i=1; i<=n; i++)
        {
            mul = mul*i;
        }
        System.out.println("Total Multiplication is : "+mul);
    }
}
