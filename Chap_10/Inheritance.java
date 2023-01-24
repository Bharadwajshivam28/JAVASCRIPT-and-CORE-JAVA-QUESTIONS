class Base{
    int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());
    }
}