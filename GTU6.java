//import java.util.Scanner;
//public class GTU6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Letter");
//        String str = sc.nextLine();
//        char ch = str.charAt(0);
//        if(Character.isLetter(ch))
//
//            switch (Character.toUpperCase(ch))
//            {
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case  'U':
//                    System.out.println(ch +" is a Vowel");
//                    break;
//                default:
//                    System.out.println(ch + " is a Consonant");
//            }
//
//    }
//}


import java.util.Scanner;
public class GTU6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Letter");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                System.out.println(ch + " is a Consonant");
        }
    }
}