public class Ques_02 {
   static int sum(int n){
       if(n==1){
           return 1;
       }
       else{
           return n + sum(n-1);
       }
   }

    public static void main(String[] args) {
         int c = sum(5);
        System.out.println(c);
    }
}