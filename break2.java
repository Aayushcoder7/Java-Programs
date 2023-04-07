//print 1 to 10 in decrement order and use break statement in While loop.
public class break2 {
    public static void main(String[] args) {
        int i = 10;
        while(i>1)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
            i--;
        }
    }
}
