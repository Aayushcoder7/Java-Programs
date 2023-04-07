import java.util.Scanner;
public class continue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
        int i = 1;
        do
        {
            i++;
            if(i==3)
            {
                System.out.println("nope");
            continue;
            }

            System.out.println(i);

        }
        while (i<=10);
    }
}
