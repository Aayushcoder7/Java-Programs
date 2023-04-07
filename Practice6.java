import java.util.Scanner;
public class Practice6 {
    public static void main(String args[])
    {
        int a;
        a=10;
        a+=15; //a+=n => a=a+n
        System.out.println(a);

        int z=6/3+54-10*5;  //associativity rule.
        System.out.println(z);

        Scanner sc = new Scanner(System.in);
        //Solve v^2 - U^2)/U*V;
        System.out.println("Enter value of V");
        int v = sc.nextInt();
        System.out.println("Enter value of U");
        int u = sc.nextInt();
        float y = (v*v - u*u)/u*v;
        System.out.println(y);
    }
}
