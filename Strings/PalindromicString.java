// check if a string is palindromic
public class PalindromicString{
    public static void main(String args[]){
        String str = "mom";
        //first we will reverse that string
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        
    }
    if (rev.equals(str)){
        //equals checks if the characters in string are same
        System.out.println("is palindromic");
    }
    else{
        System.out.println("not palindromic");
    }
        
    
}}