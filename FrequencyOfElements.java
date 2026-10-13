import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FrequencyOfElements {
       
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int [] a = new int[n];
         HashMap<Integer,Integer> temp = new HashMap<>();
          
         for( int i = 0; i < n; i++){
            a[i] = s.nextInt();
            temp.put(a[i], temp.getOrDefault(a[i],0)+1);
         }
         
         for(int i = 0; i < n; i++){
            if( temp.containsKey (a[i])){
                System.out.println("Element: "+a[i]+ " Frequency: "+temp.get(a[i]));
                temp.remove(a[i]);
            }
         }
    }
}
