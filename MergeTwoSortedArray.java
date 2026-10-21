import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // inputs for first array
    int n = s.nextInt();
    int[] arr1 = new int[n];
    for(int i = 0; i< n ; i++){
      arr1[i] = s.nextInt(); 
    }
// inputs of second array
    int m = s.nextInt();
    int[] arr2 = new int[m];
    for(int j = 0; j< m ; j++){
        arr2[j] = s.nextInt();  
      }
//index for 1st and 2nd array + final array declaration
      int index1 = 0;
      int index2 = 0;
      int k = 0;
      int[] finall = new int[n+m];
      
    // inserting the elements in finall array  
        while (index1 < n && index2 < m){
          if(arr1[index1] < arr2[index2]){
            finall[k] = arr1[index1];
            index1++;
           }
          else{
            finall[k] = arr2[index2];
            index2++;
          }
          k++;
        }

        while(index1 < n){
          finall[k] = arr1[index1];
          index1++;
          k++;
        }

      while (index2 < m){
          finall[k] = arr2[index2];
          index2++;
          k++;
      }
      
// printing finall array
      for(int i = 0; i < finall.length; i++){
        System.out.print(finall[i] + " ");
      }
    
}
}
