public class MinElementofArray{
    public static void main(String args[]){
        int numbers[] = {-2,2,4,12,7,8};
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println(min);
}
}