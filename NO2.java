package Matriks;
public class NO2 {
    public static void main(String[] args){
        int[][] A = {
            {5,7},
            {4,2},
            {6,3}
        };
        
        int[][] B = {
            {6,2},
            {5,3},
            {4,4}
        };
        if((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C = new int [A.length][A[0].length];
            for(int i=0; i<A.length; i++) {
                for(int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                    System.out.print(C[i][j]+ " ");
                }
            System.out.println();
            }
        }
        else{
            System.out.print("ukuran matriks tidak sama");
        }
    }
}
