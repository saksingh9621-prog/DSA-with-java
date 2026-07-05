package Strings;

public class Substrings {
    public static String Substrings(String str, int si, int ei){
        String SubStr="";
        for(int i=si;i<ei;i++){
            SubStr +=str.charAt(i);
        }
        return SubStr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(str.substring(0,5));            //java substring function
        System.out.println(Substrings(str, 0, 5));
    }
}
