class hero extends Thread{
    public void run(){
        while (true){
            System.out.println("Hero");
        }
    }
}
class zero extends Thread{
    public void run(){
        while (true){
            System.out.println("You are zero");
        }
    }
}
public class Ques_02 {
    public static void main(String[] args) {
        hero he = new hero();
        he.setPriority(6);
        zero ze = new zero();
        ze.setPriority(4);
        System.out.println(he.getPriority());
        System.out.println(ze.getPriority());

    }
}