// sum of array
public class ArraySum{
    public static void main(String args[]){
        int nums[] = {2,4,6,7,8};
        int sum=0;
        for (int i = 0; i<nums.length; i++){
            sum+=nums[i];
            
            
        } 
        double avg = (double)sum/nums.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}