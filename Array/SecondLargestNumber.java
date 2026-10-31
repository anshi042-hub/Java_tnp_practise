import java.util.Scanner;
public class SecondLargestNumber {
       
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int[] a = new int[n];
         for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
         }
         int one = a[0];
         int second = -1;
         for(int i= 0; i < n; i++){

            if( a[i] > second && one > a[i] ){
                second = a[i];
            }
            else if(one < a[i]){
                one = a[i];
            }
         }
System.out.println("Second Largest: "+second);
    }
}
