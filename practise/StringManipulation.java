/*import java.util.*;

public class StringManipulation {
    public static void main(String[] args){
    String s = "hello world"; 
    s = s.toUpperCase();
    String[] arr = s.split(" ");
    String sum = "";
int add = 0;

    int j = 0;
    while( j < arr.length){
    for( int i = 0; i < arr[j].length()/2; i++){
        char c1 = arr[j].charAt(i);
        char c2 = arr[j].charAt(arr[j].length() - 1 - i);
       add += Math.abs((c1 - c2));
    }
    if( arr[j].length() / 2 != 0){
        char c3 = arr[j].charAt(arr[j].length() / 2);
        add += c3 - 64;
    }
sum += add;
j++;
add = 0;
}

System.out.println(sum);
int num = Integer.parseInt(sum);
System.out.print(sum);

}
}*/



//Direction String Manipulation

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StringManipulation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        s.nextLine();
        String start = s.nextLine();
        String instruction = s.nextLine();
int Xdis =start.charAt(0) - '0';
int Ydis =start.charAt(1) - '0';
char face = start.charAt(2); 
HashMap<Character, HashMap< Character,Character>> direction = new HashMap<>();
 direction.put('E', new HashMap<>(Map.of('R', 'S', 'L', 'N')));
 direction.put('N', new HashMap<>(Map.of('R', 'E', 'L', 'W')));
 direction.put('S', new HashMap<>(Map.of('R', 'W', 'L', 'E')));
 direction.put('W', new HashMap<>(Map.of('R', 'N', 'L', 'S')));

        for( char c : instruction.toCharArray()){
         if(c == 'M'){
              if(face == 'E'){
                    Xdis++;
                }
                else if (face == 'W'){
                    Xdis--;
                }            
                else if(face == 'N'){
                    Ydis++;
                }
                else if( face == 'S'){
                    Ydis--;
                }
        }
        else if (c == 'R' || c == 'L'){
           face =  direction.get(face).get(c);
        }
    }
System.out.print(Xdis +"-" + Ydis + "-" + ((Xdis > x || Ydis > y) ? "ER" : face));

    }}
            


        
       
