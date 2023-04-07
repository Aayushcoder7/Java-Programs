//print 1 to 10 in decrement order and use break statement in For loop.
public class break1 {
    public static void main(String[] args) {
        for(int i = 10; i>= 1 ; i--)
        {
            if(i==5)
            {
                break;
            }
            System.out.print(i+" ");
        }
    }
}
