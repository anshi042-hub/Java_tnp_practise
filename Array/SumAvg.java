import java.util.Scanner;
public class SumAvg {
    
public static void main (String[] args){
   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   int[] arr = new int[n];
   int sum = 0;
   for (int i = 0; i < n; i++){
    arr[i] = s.nextInt();
       sum += arr[i];
    }
    float avg = (float) sum / n;

    System.out.printf("Total: %d%nAverage: %.2f%n",sum,avg);
   
    }
}
