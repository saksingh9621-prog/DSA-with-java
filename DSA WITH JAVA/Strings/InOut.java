package Strings;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
       // name=sc.next();                            //single word is only printed
        name=sc.nextLine();                             //whole line is print or everything is printed
        System.out.println(name);
        System.out.println(name.length());                 //for finding length of String 
                                                   //Concatenation
        String firstname="Sakshi";
        String lastname="Singh";
        String fullname=firstname + " " + lastname;
        System.out.println(fullname);                                           
    }
}
