package Strings;

public class Compare {
    public static void main(String[] args) {
        String s1="tony";
        String s2="tony";
        String s3=new String("tony");
        if(s1==s2){
          System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
         if(s1==s3){                               //in s3 it store new value and equal function checks only value
          System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        if(s1.equals(s3)){                              //When we checks value of two strings we use .equals()
             System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
