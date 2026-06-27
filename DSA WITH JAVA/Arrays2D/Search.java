package Arrays2D;
import java.util.*;

public class Search {
    public static boolean searched_key(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.print("found key at=" + i + "," + j );
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
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
               searched_key(matrix,5);
            }
        }
