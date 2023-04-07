//if else

import java.util.Scanner;
public class Practice12 {


    public static void main(String args[])
    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//
//        if(age>=18)
//        {
//            System.out.println("You are eligible for the Driving License");
//        }
//        else
//        {
//            System.out.println("You are not eligible for the Driving License");
//        }
//
//            boolean a = true;
//            boolean b = false;
//            boolean c = true;
//            if(a && b || c)
//            {
//                System.out.println("Correct");
//            }
//            else{
//                System.out.println("Incorrect");
//            }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();
        System.out.println("The value of A = " + a + " and B = " + b);
        if(a<=10 && b>=15)
        {
            System.out.println("Great job");
        }
        else{
            System.out.println("Try again later");
        }
    }
}

