import java.util.Scanner;
public class String1 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String str = "Aayush";
        System.out.println(str);
        System.out.printf("%s\n",str);
        int a = 7;
        float b = 7.7787f;
        System.out.format("Value of a is %d and value of b is %f\n",a,b);
        System.out.printf("Value of a is %d and value of y is %f\n",a,b);
        System.out.println("Value of a is "+a+" and value of b is "+b );

//        String x = sc.next();
        String y = sc.nextLine();

//        System.out.println(x);
        System.out.println(y);
    }
}
