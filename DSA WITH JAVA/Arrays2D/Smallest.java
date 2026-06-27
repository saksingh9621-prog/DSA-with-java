package Arrays2D;
import java.util.*;

public class Smallest{
    public static void largest_no(int matrix[][]){
        int smallno=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<smallno){
                    smallno=matrix[i][j];
                }
            }
        }
        System.out.println("largest no=" + smallno);

    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
       } 
       largest_no(matrix);
    }
}
