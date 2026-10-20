import java.util.Scanner;
   
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int[] array = new int [n];

     for(int i = 0; i < n; i++){
        array[i] = s.nextInt();
     }
     for( int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if( array[i] == array[j]){
                for(int k = j; k < n-1; k++){
                    
                    array[k] = array[k+1];
                }
                n--;
                j--;
            }
        }
        System.out.print(array[i] + " ");
     }
}