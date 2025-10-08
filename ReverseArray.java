import java .util.*;
public class reversearray{
    public static void main(String args[]){
        int arr[]={2,4,6,8,9};
        for (int i = 0; i<arr.length; i++){
            
            System.out.print(arr[i]);
            
        }
        reversearray(arr);
    }
    public static void reversearray(int arr[]){
        int temp;
        int first= 0;
        int last = arr.length-1;
        while(first<last){
            temp = arr[last];
            arr[last]=arr[first];
            arr[first]= temp;
            first++;
            last--;
        }
        System.out.println();
        System.out.println("after reversing");
        for (int i = 0; i<arr.length; i++){
            
            System.out.print(arr[i]);
            
        }
    }
}