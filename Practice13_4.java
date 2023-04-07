import java.util.Scanner;
public class Practice13_4{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number from 1-7");
        byte num = sc.nextByte();

        switch (num)
        {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thurday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Please Enter the Valid Number.");
                break;
        }

    }
}
