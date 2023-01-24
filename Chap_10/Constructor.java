class Base1 {
    Base1(){
        System.out.println("Hello constructor");
    }
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class export extends Base1{
    export(){
        System.out.println("Puni ji");
    }
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Base1 b = new Base1();
        export e = new export();

    }
}




