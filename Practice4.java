
import java.util.Scanner;
public class Practice4 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to covert from Kilometer to Mile");
        float num = sc.nextFloat();
        double converter = num * 0.6213711922;
        System.out.println(num + " Kilometer --> " + converter + " Mile");
    }
}
