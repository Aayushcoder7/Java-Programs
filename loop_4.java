import java.util.Scanner;
public class loop_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
//        System.out.printf("TABLE OF %D IS : ",n);
        for(int i=1; i<=n; i++)
        {

            System.out.printf("%d * %d = %d \n",i,n,i*n);
        }
    }
}
