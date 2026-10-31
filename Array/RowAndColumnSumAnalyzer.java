import java.util.Scanner;

public class RowAndColumnSumAnalyzer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int r = s.nextInt();
       int c = s.nextInt();
       int[][] matrix = new int[r][c];
       int sum = 0;
       int max_row = 0;
       int index = 0;
        
       for (int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
       matrix[i][j] = s.nextInt();
        }
    }

       for (int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
        sum += matrix[i][j];
        }
        if(max_row < sum){
            max_row = sum;
            index = i + 1;
        }
        System.out.println("Row "+(i+1)+" Sum: "+sum);
        sum = 0;
       }
     for (int j = 0; j < c; j++){
        for (int i = 0; i < r; i++){
            sum += matrix[i][j];
        }
        System.out.println("Column "+ (j+1)+ " Sum: "+sum);
        sum = 0;
     }
     System.out.println("Highest Sales Branch: " + index);
     System.out.println("Highest Sales: " + max_row);
       }

    }

