//Replace word in the sentence.
public class String5 {
    public static void main(String args[])
    {
        String letter = "Dear <|name|>, THanks a lot ";
        String nletter = letter.replace("name", "Aayush Parikh");
        letter = letter.replace("name","Aayush");
        System.out.println(letter);
        System.out.println(nletter);
    }
}
