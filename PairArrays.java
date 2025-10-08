public class PairArrays{
    public static void main(String args[]){
        int numbers[] ={1,2,3,4,5};
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]);
            
        }
        System.out.println();
        pairArrays(numbers);
    }
    public static void pairArrays(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")");
                
            }
            System.out.println();
        }
    }
}