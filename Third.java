//Take two numbers from the user and make calculator
import java.util.Scanner;
public class Third
{
    public static void main(String [] args)
    {
        System.out.println("The two numbers taken by the user is");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        float a = sc.nextFloat();
        System.out.println("Enter Second Number");
        float b = sc.nextFloat();
        float add=a+b;
        System.out.print("Addition : ");
        System.out.println(add);
        float sub=a-b;
        System.out.print("Subtraction : ");
        System.out.println(sub);
        float mul=a*b;
        System.out.print("Multiplication : ");
        System.out.println(mul);
        float div=a/b;
        System.out.print("Division : ");
        System.out.println(div);
    }
}
