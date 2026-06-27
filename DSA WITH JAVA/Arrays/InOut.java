package Arrays;
import java.util.*;

public class InOut {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner SC= new Scanner(System.in);
        marks[0]=SC.nextInt();
        marks[1]=SC.nextInt();                         //input
        marks[2]=SC.nextInt();

        System.out.println("Phy=" + marks[0]);
        System.out.println("Chem=" + marks[2]);           //output
        System.out.println("Maths=" + marks[1]);

        marks[2]=marks[2]+2;                               //update
        System.out.println(marks[2]);
    }
}
