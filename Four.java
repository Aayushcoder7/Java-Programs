//Calculate percentage of a given student of 5 subjects taken from the keyboard.
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Four {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Maths score");
        float maths=sc.nextFloat();
        System.out.println("Enter your English score");
        float english = sc.nextFloat();
        System.out.println("Enter your Chemistry score");
        float chemistry = sc.nextFloat();
        System.out.println("Enter your physics score");
        float physics = sc.nextFloat();
        System.out.println("Enter your Computer score");
        float computer = sc.nextFloat();
        float percentage =( maths + english + chemistry + physics + computer) / 500 * 100;
        System.out.println("Your overall Percentage is : " + percentage);
    }
}
