import java.util.Scanner;
import java.lang.Math;

public class MatrixDiagonalAnalysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int [][] matrix = new int [n][n];

         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = s.nextInt();
            }
         }
         
         int i = 0;
         int j = 0;
         int sumMain = 0;
         int sumSecondary = 0;

         while(i < n){
            sumMain += matrix[i][j];
            i++;
            j++;
         }

         i=0;
         j = n-1;
         while ( i < n){
            sumSecondary += matrix[i][j];
            i++;
            j--;
         }

         System.out.println("Main Diagonal Sum: "+ sumMain);
         System.out.println("Secondary Diagonal Sum: "+ sumSecondary);
         System.out.println("Difference: "+ Math.abs(sumMain - sumSecondary));
    }
}
