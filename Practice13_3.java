import java.util.Scanner;
public class Practice13_3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income in Lakhs");
        float income = sc.nextFloat();

        float tax = 0;

        if(income<=2.5f)
        {
            tax = tax = 0f;
        }
        else if (income>2.5f && income<=5.0f)
        {
            tax = tax + 0.05f*(income - 2.5f);
        }
        else if (income>5.0f && income<=10.0f)
        {
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.2f*(income - 5.0f);
        }
        else if(income > 10f)
        {
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.2f*(10.0f - 5.0f);
            tax = tax + 0.3f*(income - 10.0f);
        }
        System.out.println("Your Tax is :"+tax);
    }
}
