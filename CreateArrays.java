import java.util.*;
public class CreateArrays{
    public static void main(String args[]){
        System.out.println("Enter the size of arrays");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("these are the elements you entered");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        
        }
        
}
}