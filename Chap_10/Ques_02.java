class rectangle{
    public int width;
    public int length;

    rectangle(int w, int l){
        this.width = w;
        this.length = l;
    }
    public int area(){
        return width*length;
    }
}
class cuboid extends rectangle{
    public int height;
    cuboid(int w, int l, int h) {
        super(w, l);
        this.height = h;
    }
    public int volume(){
        return width*height*length;
    }
}
public class Ques_02 {
    public static void main(String[] args) {
        cuboid cu = new cuboid(3, 5, 5);
        rectangle rc = new rectangle(4, 6);
    }
}

