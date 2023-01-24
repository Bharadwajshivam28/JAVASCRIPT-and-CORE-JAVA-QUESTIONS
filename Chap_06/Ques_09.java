public class Ques_09 {
    public static void main(String[] args) {
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        boolean isSorted = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Sorted !");
        }
        else {
            System.out.println("Not Sorted !");
        }
    }
}
