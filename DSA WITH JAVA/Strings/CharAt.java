package Strings;

public class CharAt {
    public static void printstring(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        String firstname="Sakshi";
        String lastname="Singh";
        String fullname=firstname + " " + lastname;
        System.out.println(fullname.charAt(0)); 
        printstring(fullname);
    }
}
