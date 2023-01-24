 class circle{
    public int radius;

   circle(int r){
       System.out.println("I am circle");
       this.radius = r;
   }
   public double area(){
       return Math.PI*this.radius*radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Ques_01 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder(12, 4);

    }
}