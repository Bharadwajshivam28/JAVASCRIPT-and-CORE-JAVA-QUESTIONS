public class Ques_02 {
    public static void main(String[] args) {
        try {
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Haha...");
        }
        catch (ArithmeticException e){
            System.out.println("Hehe...");
        }

    }

}