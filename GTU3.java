//BMI = W/H^2
import java.util.Scanner;
public class GTU3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Weight");
        float weight = sc.nextFloat();
        System.out.println("Enter your Height");
        float height = sc.nextFloat();
        double w = weight* 0.45359237;
        double h= height* 0.0254;
        double bmi= w/(h*h);
        System.out.println("Your BMI is : "+ bmi);
    }
}
