import java.util.Scanner;
public class MatrixTranspose {
       
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int r = s.nextInt();
         int c = s.nextInt();
         int [][] matrix = new int [r][c];
         for(int i =0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = s.nextInt();
            }
         }
         int[] [] result = new int[c][r];
         for(int i =0; i < r; i++){
            for(int j = 0; j < c; j++){
          result[j][i] = matrix[i][j];
            }
         }
         for(int i =0; i < c; i++){
            for(int j = 0; j < r; j++){
         System.out.print(result[i][j] + " ");
            }
            System.out.println();
         }
    }
    
}
