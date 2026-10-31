import java.util.Scanner;
public class reverse {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
// Read the array elements
        for( int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }

        // to reverse the array
        int j = n-1;
        int i = 0;
        while ( i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
                i++;
        }
        //for printing the arr elements
     for( int k = 0; k < n; k++){
        System.out.print(a[k]+" ");
     }
    }
    
}
