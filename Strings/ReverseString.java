//reverse a string
import java.util.*;
public class ReverseString{
    public static void main(String args[]){
        String str = "Saylee";
        String rev="";
        System.out.println(str);
    for (int i=str.length()-1; i>=0; i--){
        rev= rev+ str.charAt(i);
        
    }
    System.out.println(rev);
}
}