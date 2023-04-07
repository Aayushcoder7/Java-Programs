
//    public class GTU7 {
//            public static void main(String[] args)
//            {
//                int a = 65 + (int)(Math.random()* (80-65));
//                int b = 65 + (int)(Math.random()* (80-65));
//                int c = 65 + (int)(Math.random()* (80-65));
//
//                int num1 = (int)(Math.random() * (10));
//                int num2 = (int)(Math.random() * (10));
//                int num3 = (int)(Math.random() * (10));
//                int num4 = (int)(Math.random() * (10));
//
//                System.out.println("" + (char)(a)+ (char)(b) + (char)(c) + num1 + num2 +num3 + num4);
//            }
//        }


//public class GTU7 {
//    public static void main(String[] args) {
//        // Generate three random uppercase letters
//        int letter1 = 65 + (int)(Math.random() * (90 - 65));
//        int letter2 = 65 + (int)(Math.random() * (90 - 65));
//        int letter3 = 65 + (int)(Math.random() * (90 - 65));
//
//        // Generate four random digits
//        int number1 = (int)(Math.random() * 10);
//        int number2 = (int)(Math.random() * 10);
//        int number3 = (int)(Math.random() * 10);
//        int number4 = (int)(Math.random() * 10);
//
//        // Display number plate
//        System.out.println("" + (char)(letter1) + ((char)(letter2)) +
//                ((char)(letter3)) + number1 + number2 + number3 + number4);
//    }
//}

//import java.util.Random;
//public class GTU7
//{
//    public static void main(String[] args) {
//        Random r = new Random();
//        char a = (char)(r.nextInt(26) + 'A');
//        char b = (char)(r.nextInt(26) + 'A');
//        char c = (char)(r.nextInt(26) + 'A');
//        System.out.print(a);
//        System.out.print(b);
//        System.out.print(c);
//
//        int n1 = (int)(r.nextInt(9) + 0);
//        System.out.print(" " + n1);
//        int n2 = (int)(r.nextInt(9)+0);
//        System.out.print(n2);
//        int n3 = (int)(r.nextInt(9)+0);
//        System.out.print(n3);
//        int n4 = (int)(r.nextInt(9)+0);
//        System.out.print(n4);
//    }
//}

import java.util.Random;
public class GTU7{
    public static void main(String[] args) {
        Random r = new Random();
        char a = (char)(r.nextInt(26)+'A');
        char b = (char)(r.nextInt(26)+'A');

        int num1 = (int)(r.nextInt(2)+0);
        int num2 = (int)(r.nextInt(9)+0);

        int num3 = (int)(r.nextInt(9)+0);
        int num4 = (int)(r.nextInt(9)+0);
        int num5 = (int)(r.nextInt(9)+0);
        int num6 = (int)(r.nextInt(9)+0);

        System.out.print(a);
        System.out.print(b);
        System.out.print(" " + num1);
        System.out.print(num2);
        System.out.print(" "+num3);
        System.out.print(num4);
        System.out.print(num5);
        System.out.print(num6);
    }
}