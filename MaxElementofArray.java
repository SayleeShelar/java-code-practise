public class MaxElementofArray{
    public static void main(String args[]){
        int numbers[] = {2,4,12,7,8};
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>maxsum){
                maxsum = numbers[i];
            }
        }
        System.out.println(maxsum);
}
}