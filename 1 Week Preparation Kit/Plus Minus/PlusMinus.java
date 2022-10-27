
import java.util.*;
public class PlusMinus{
public static void plusMinus(List<Integer> arr) {
   
    float posNum = 0;
    float negaNum = 0;
    float zeroNum = 0;
    int n = arr.size();
    for ( int i = 0; i <n; i++){
        
        if (arr.get(i) > 0){
            posNum++;
        }
        else if (arr.get(i)< 0){
            negaNum++;
        }
        else {
            zeroNum++;
        }
    }
    
    System.out.printf("%.6f%n", posNum/n);
    System.out.printf("%.6f%n", negaNum/n);
    System.out.printf("%.6f%n", zeroNum/n);
    
    
    }

public static void main (String args []){
    
    List<Integer> list = new ArrayList<Integer>(); 
    Collections.addAll(list, 1, 1, 0, -1, -1);

    plusMinus(list);
    

}

}
