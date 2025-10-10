// removing duplicates from an array
import java.util.*;
public class RemoveDuplicates{
    public static void main(String args[]){
        int nums[] = {2,2,3,4,5,7,8,9,4};
        Set<Integer> set = new LinkedHashSet<>();
        for(int i: nums){
            set.add(i);
        }
        System.out.println(set);
    }
}