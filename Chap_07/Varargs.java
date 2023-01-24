public class Varargs {
   // static int sum(int a, int b) {
      //  return a + b;
    //}

    //static int sum(int a, int b, int c) {
      //  return a + b + c;
    //}
    //static int sum(int a, int b, int c, int d) {
      //  return a + b + c + d;
    //}
    static int sum(int ...arr){
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(4, 3, 9));
        System.out.println(sum(6, 5, 7, 4));
    }
}

