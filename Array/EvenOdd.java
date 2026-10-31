import  java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
       int count_even= 0;
       int count_odd = 0;
       
       for(int i = 0; i <n; i++){
        arr[i] = s.nextInt();
        if( arr[i] %2 == 0){
            count_even++;
        }
        else{
            count_odd++;
        }
       }
     System.out.printf("Even: %d%nOdd: %d", count_even,count_odd);

    }
}
