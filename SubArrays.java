import java.util.*;
public class SubArrays{
    public static void main(String args[]){
        int numbers []= {1,2,3,4,5};
        subArrays(numbers);
        
        
    }
    public static void subArrays(int numbers[]){
        for (int i = 0; i<numbers.length;i++){
            int start = numbers[i];
            for (int j = i; j<numbers.length; j++){
                int end = numbers[j];
                for (int k = start; k<=end; k++){
                    System.out.print(k);
                }
                System.out.println();
                
            }
        }
       
        }
    }
