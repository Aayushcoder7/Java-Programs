//Encrypt grade by 8 and Decrypt grade by 8.
public class Practice9 {
    public static void main(String args [])
    {
        char grade = 'J';
//        ograde = (char)(grade + 8);  //Increment / Encrypt
//        System.out.println("Increment : "+grade);
        char ngrade = (char)(grade - 8);
        System.out.println("Decrement " + " of " + grade + " is : " + ngrade);  // Decrement / Decrypt
    }
}
