import java.util.Scanner;
   public class MoveZerosToEnd{

       public static void main(String[] args) {
           Scanner s = new Scanner(System.in);
           int n = s.nextInt();
           int[] array = new int[n];
           
           int ind = 0;
           for(int i = 0; i < array.length; i++){
            array[i] = s.nextInt();
           }

           for(int i = 0; i < n; i++){
            if( array[i] == 0){
                for(int j = i; j < n-1; j++){
                    array[j] = array[j+1];
                }
                n--;
                i--;
            }
           }
           for(int i = n; i < array.length; i++){
                array[i] = 0;
           }
            for(int i = 0; i < array.length;i++){
                System.out.print(array[i] + " ");
            }
   }
}