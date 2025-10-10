//count even and odds in an array

import java.util.*;
public class CountEvenOdds{
    public static void main(String args[]){
        int num[] = {2,3,4,5,6,7,8};
        int counteven=0;
        int countodd =0;
        for (int i=0; i<num.length;i++){
            if(num[i]%2==0){
                counteven+=1;
            }
            else{
                countodd+=1;
            }
        }
        System.out.println("the number of even elements are"+" "+ counteven);
        System.out.println("the number of odd elements are"+" "+ countodd);
        
    }
}