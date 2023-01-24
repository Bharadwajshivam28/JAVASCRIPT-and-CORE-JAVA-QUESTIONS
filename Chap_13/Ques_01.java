class Practice extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class Practice2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }
    }
}
public class Ques_01 {
    public static void main(String[] args) {
        Practice p = new Practice();
        Practice2 y = new Practice2();
        p.start();
        y.start();
    }
}