import java.util.Locale;
import java.util.Scanner;
public class string2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String name = "  Aayush     ";
        int value = name.length();
        System.out.println(value);

        String tlc = name.toLowerCase();
        System.out.println(tlc);

        String tuc = name.toUpperCase();
        System.out.println(tuc);

        String trim = name.trim();
        System.out.println(trim);

        String substring = name.substring(1);
        System.out.println(substring);

        String Substring = name.substring(2,5);
        System.out.println(Substring);

        String replace = name.replace('a', 'A');
        System.out.println(replace);

        //String sw = name.endsWith("AA");
        System.out.println(name.endsWith("h"));

//        String str = sc.nextLine();
//        System.out.println(str);
//        System.out.println("Enter any one sentence");
    }
}