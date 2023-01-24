class square{
    int side;

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4 * side;
    }
}

public class Ques_03 {
    public static void main(String[] args) {
        square squ = new square();
        squ.side = 5;
        System.out.println("The area of the square is " + squ.area());
        System.out.println("The perimeter of the square is " + squ.perimeter());
    }
}
