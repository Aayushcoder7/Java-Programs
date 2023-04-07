//Switch case.
import java.util.Scanner;
public class Practice13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the En No. to get the Name of that student");
        int num = sc.nextInt();
        switch (num)
        {
            case 1: {
                System.out.println("Shivam");
                break;
            }
            case 2: {
                System.out.println("Mehul");
                break;
            }
            case 3: {
                System.out.println("Rahul");
                break;
            }
            case 4: {
                System.out.println("Harsh");
                break;
            }
            case 5: {
                System.out.println("Ajay");
                break;
            }
            case 6: {
                System.out.println("Rashmin");
                break;
            }
            case 7: {
                System.out.println("Aayush");
                break;
            }
            case 8: {
                System.out.println("Pankaj");
                break;
            }
        }
    }
}
