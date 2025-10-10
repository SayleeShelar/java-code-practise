//check if the array is palindromic
public class PalindromeArray{
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        boolean ispalindrome=true;
        int start = 0;
        int end = nums.length-1;
        while(nums[start]!=nums[end]){
            ispalindrome=false;
            start++;
            end--;
        }
        System.out.println(ispalindrome);
}
}