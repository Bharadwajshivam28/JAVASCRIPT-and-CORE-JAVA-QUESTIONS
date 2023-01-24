public class Methods_Overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }

    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new world");
    }

    public static void main(String[] args) {
        //  tellJoke();

        // Case 1: Changing the integer
        //int x = 45;
        // change(x);
        // System.out.println(x);

        // Case 2; Changing the array
       //int [] marks = {52, 73, 77, 89, 98, 94};
        //change2(marks);
        //System.out.println(marks[0]);

        //Methods overloading
        foo();
        foo(3000);
        //Arguments are actual!
    }
}
