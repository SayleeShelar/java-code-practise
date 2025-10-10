//count positive, negative and zero elements of an array
public class NumberRange{
    public static void main(String args[]){
        int num[]={-1,-2,0,3,0,4,5};
        int countpos=0;
        int countneg=0;
        int countzeroes=0;
        
        
        for (int i = 0; i<num.length; i++){
            if(num[i]<0){
                countneg+=1;
            }
            else if(num[i]>0){
                countpos+=1;
            }
            else{
                countzeroes+=1;
            }
        
    }
    System.out.println("the number of positive numbers are: "+countpos);
    System.out.println("the number of negative numbers are: "+countneg);
    System.out.println("the numbers of zeroes are: "+countzeroes);
    
}
}