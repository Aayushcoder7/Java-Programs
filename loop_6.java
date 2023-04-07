//print 1 to n numbers and its sum.
public class loop_6 {
    public static void main(String[] args) {
        int sum =0;
        int i;
        for(i=1; i<=10; i++)
        {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("Sum : "+sum);
    }
}
