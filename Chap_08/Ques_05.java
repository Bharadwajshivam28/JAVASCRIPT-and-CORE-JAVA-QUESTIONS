class Tommy{
    public void hit() {
        System.out.println("Hitting !");
    }
    public void run(){
        System.out.println("Running ! ");
    }
    public void fire(){
        System.out.println("Firing !");
    }
}

public class Ques_05 {
    public static void main(String[] args) {
        Tommy game = new Tommy();
        game.hit();
        game.run();
        game.fire();
    }
}