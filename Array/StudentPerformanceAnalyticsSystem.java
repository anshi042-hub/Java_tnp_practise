import java.util.Scanner;

public class StudentPerformanceAnalyticsSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] marks = new int[n];

        int highest = 0; 
        int sum = 0;
        
        for( int i = 0; i < n; i++){
            marks[i] = s.nextInt();
        }
        
        int lowest = marks[0];
        for( int i = 0; i < n; i++){
            sum += marks[i];
            if(marks[i] > highest){
              highest = marks[i];
            }
            if( marks[i] < lowest){
                lowest = marks[i];
            }
        }
     double average = (double) sum / n;
     int passed = 0;
     int failed = 0;
     int above_avg = 0;
     
     for(int i = 0; i < n; i++){
        if(marks[i] >= 40){
            passed++;
        }
        else{
            failed++;
        }

        if(marks[i] > average){
            above_avg++;
        }
    }
       System.out.printf("Average: %.2f%nHighest: %d%nLowest: %d%nPassed: %d%nFailed: %d%nAbove Average: %d",average, highest, lowest, passed, failed, above_avg);  
    }
}
