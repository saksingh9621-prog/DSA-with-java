package Arrays;
import java.util.*;

public class Percentage {
    public static void main(String[] args) {
        int marks[]=new int[100];
        System.out.println("Length of array=" + marks.length);
        Scanner SC= new Scanner(System.in);
        marks[0]=SC.nextInt();
        marks[1]=SC.nextInt();                         
        marks[2]=SC.nextInt();

        System.out.println("Phy=" + marks[0]);
        System.out.println("Chem=" + marks[2]);          
        System.out.println("Maths=" + marks[1]);

        int Percentage = (marks[1]+marks[2]+marks[0])/3;
        System.out.println("Percentage==" + Percentage + "%");
    }
}

