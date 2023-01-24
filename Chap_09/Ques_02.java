class Cylinder2 {
    int radius;
    int height;
    double surface_area;
    double volume;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getSurface_area() {
        return (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius);
    }
    public double getVolume() {
        return 3.14 * radius * radius * height;
    }
}

public class Ques_02 {
    public static void main(String[] args) {
        Cylinder2 c2 = new Cylinder2();
        c2.setHeight(5);
        c2.setRadius(4);
        System.out.println(c2.getSurface_area());
        System.out.println(c2.getVolume());
    }
}