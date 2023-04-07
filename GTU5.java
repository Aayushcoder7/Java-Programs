//import java.util.Scanner;
//public class GTU5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st Integer");
//        int a = sc.nextInt();
//        System.out.println("Enter 2nd Integer");
//        int b = sc.nextInt();
//        System.out.println("Enter 3rd Integer");
//        int c = sc.nextInt();
//        int temp;
//        if(b>a)
//        {
//            temp=b;
//            b=a;
//            a=temp;
//        }
//        if(c>b){
//            if(c>a)
//            {
//                temp=c;
//                c=b;
//                b=a;
//                a=temp;
//            }
//            else {
//                temp=c;
//                c=b;
//                b=temp;
//            }
//        }
//        System.out.println("Decreasing Order : "+ a +" "+ b +" "+ c );
//    }
//}


import java.util.Scanner;
public class GTU5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();
        System.out.println("Enter the value of C");
        int c = sc.nextInt();
        int temp;
        if(a<b)
        {
            temp = a;
            a=b;
            b=temp;
        }
        if(c>b)
        {
            if (c>a)
            {
                temp = c;
                c=b;
                b=a;
                a= temp;
            }
            else {
                temp = c;
                c=b;
                b=temp;
            }
        }

        System.out.println("Decreasing order is: " + a + " "+ b +" " + c);
    }
}