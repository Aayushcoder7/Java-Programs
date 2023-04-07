import java.util.Scanner;
public class Practice13_2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks");
        byte p = sc.nextByte();
        System.out.println("Enter your Chemistry marks");
        byte c = sc.nextByte();
        System.out.println("Enter your Mathematics marks");
        byte m = sc.nextByte();

        int avg = (p+c+m)/3;
        System.out.println("Your Average Score is: "+avg);

        if(avg>40 && p>33 && c>33 && m>33)
        {
            System.out.println("Congratulations, You have been Promoted.");
        }
        else{
            System.out.println("Sorry, Try again next time.");
        }
    }
}
