import java.util.Scanner;

public class SearchAnElement {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int [n];

    for(int i = 0; i< n; i++){
          arr[i] = s.nextInt();
    }
        int target = s.nextInt();
        int found = -1;
        for(int i = 0; i < n; i++){
           
            if( target == arr[i]){
                found = i;
                break;
            }
        }
        System.out.println("Index: "+found);
    }
    
}
