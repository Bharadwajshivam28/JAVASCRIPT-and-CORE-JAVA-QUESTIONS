public class Ques_04 {
    public static void main(String[] args) {
        int [][] a = {{1,5},{9,3}};
        int[][] b = {{5,3},{6,5}};
        int [][] c = new int[2][2];
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
