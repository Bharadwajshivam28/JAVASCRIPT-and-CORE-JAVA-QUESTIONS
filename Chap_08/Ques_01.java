class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        return name = n;
    }
}

public class Ques_01 {
    public static void main(String[] args) {
        Employee ram = new Employee();
        ram.salary = 10000;
        ram.setName("CoderBabu");
        System.out.println(ram.getSalary());
        System.out.println(ram.getName());
    }
}