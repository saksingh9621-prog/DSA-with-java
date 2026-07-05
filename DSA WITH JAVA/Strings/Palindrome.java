package Strings;

public class Palindrome {
    public static boolean ispalindrome(String str){
     for(int i=0;i<str.length()/2; i++){
        if(str.charAt(i)==str.charAt(str.length()-i-1)){
          return true;
        }
     }
     return false;
    }
    public static void main(String[] args) {
        String str="noon";
        // if(ispalindrome(str)){
        //     System.out.println("it is palindrome");
        // }
        // else{
        //     System.out.println("it is not palindrome");
        // }
        System.out.println(ispalindrome(str));
    }
}
