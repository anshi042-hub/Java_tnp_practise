import java.util.Scanner;
public class MaxMin{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int[] arr = new int[n];
     arr[0] = s.nextInt();
     int max = arr[0];
     int min = arr[0];
     for( int i = 1; i < n; i++){
        arr[i] = s.nextInt();

        if (max < arr[i]){
            max = arr[i];
        }
        if (min > arr[i]){
            min = arr[i];
        }
     }
     System.out.printf("Maximum: %d%nMinimum: %d%n", max,min);
    }
}