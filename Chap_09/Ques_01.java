class Cylinder {
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Ques_01 {
    public static void main(String[] args) {
        Cylinder cl = new Cylinder();
        cl.setRadius(5);
        System.out.println(cl.getRadius());
        cl.setHeight(78);
        System.out.println(cl.getHeight());
    }
}