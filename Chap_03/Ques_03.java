public class Ques_03 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot";
        String _letter = letter.replace("<|name|>", "Shivam");
        System.out.println(_letter);
    }
}
