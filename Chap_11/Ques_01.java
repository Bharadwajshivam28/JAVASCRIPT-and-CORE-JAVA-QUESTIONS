abstract  class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refill...");
    }
    void changeNib(){
        System.out.println("Changing Nib...");
    }
}

public class Ques_01 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.write();
        pen.refill();
    }
}
