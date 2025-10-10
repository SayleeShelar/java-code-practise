//linear search of an element
public class LinearSearch{
    public static void main(String args[]){
        int nums[] = {2,3,7,5,6,4};
        int key =7;
        for (int i=0; i<nums.length; i++){
            if(nums[i]==key){
                System.out.println("key found at index: "+i);
                break;
            }
            
        }
        
    }
}
