class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");

    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir ! ");
    }
     @Override
    public void eat() {
        System.out.println("Eating..");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class Ques_02 {
    public static void main(String[] args) {
        Human hero = new Human();
        hero.sleep();
        hero.eat();
        hero.speak();
        hero.jump();
        hero.bite();
    }
}