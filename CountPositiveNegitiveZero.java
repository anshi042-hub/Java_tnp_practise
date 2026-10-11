import java.util.Scanner;
public class CountPositiveNegitiveZero {

    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
            if( a[i] > 0){
                pos++;
            }
            else if (a[i] < 0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.printf("Positive: %d%nNegative: %d%nZero: %d%n",pos,neg,zero);

    }
}
