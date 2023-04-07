
import java.util.Scanner;
public class GTU2 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Equation 1 : ");
        System.out.println("Value of a");
        double a=sc.nextDouble();
        System.out.println("Value of b");
        double b=sc.nextDouble();
        System.out.println("Value of e");
        double e=sc.nextDouble();

        System.out.println("Equation 2 : ");
        System.out.println("Value of c");
        double c = sc.nextDouble();
        System.out.println("Value of d");
        double d = sc.nextDouble();
        System.out.println("Value of f");
        double f = sc.nextDouble();

        double X = ((e*d) - (b*f))/((a*d)-(b*c));
        double Y = ((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("X = "+X + "Y = "+Y);
    }
}
