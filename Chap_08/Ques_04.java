class Rectangle{
    int length;
    int width;

    public int perimeter(){
        return 2 * (length + width);
    }
    public int area(){
        return width * length;
    }
}

public class Ques_04 {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.length = 4;
        rc.width= 5;
        System.out.println("The perimeter value is " + rc.perimeter());
        System.out.println("The area value is " + rc.area());
    }
}
